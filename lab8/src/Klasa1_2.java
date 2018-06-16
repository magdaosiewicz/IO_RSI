import jade.core.Agent;
import jade.core.behaviours.FSMBehaviour;
import jade.core.behaviours.OneShotBehaviour;

/**
 * Created by Magda on 16.06.2018.
 */
public class Klasa1_2 extends Agent{


        //STANY
        private static final String STATE_A = "A";
        private static final String STATE_B = "B";
        private static final String STATE_C = "C";
        private static final String STATE_D = "D";
        private static final String STATE_E = "E";

        protected void setup() {
            FSMBehaviour fsm = new FSMBehaviour(this) {
                public int onEnd() {
                    myAgent.doDelete();
                    return super.onEnd();
                }
            };

		   //rejestracja pojedynczego zachowania jako poczatkowe
            fsm.registerFirstState(new NamePrinter(),  STATE_A);
            //rejestracja jako stany posrednie
            fsm.registerState(new RandomGenerator(1),  STATE_B);
            fsm.registerState(new NamePrinter(),  STATE_C);
            fsm.registerState(new RandomGenerator(1),  STATE_D);
            //rejestracja jako stan koncowy
            fsm.registerLastState(new NamePrinter(),  STATE_E);

            fsm.registerDefaultTransition( STATE_A,  STATE_B);
            fsm.registerTransition( STATE_B,  STATE_C, 1);
            fsm.registerTransition( STATE_B,  STATE_D, 0);
            fsm.registerDefaultTransition( STATE_C,  STATE_D);
            fsm.registerTransition( STATE_D, STATE_E, 0);
            fsm.registerTransition( STATE_D,  STATE_A, 1);

            addBehaviour(fsm);

        }
        private class NamePrinter extends OneShotBehaviour {
            public void action() {
                System.out.println("Stan: " + getBehaviourName());
            }
        }

        private class RandomGenerator extends NamePrinter{
            private int maxExitValue;
            private int exitValue;

            private RandomGenerator(int max) {
                super();
                maxExitValue = max;
            }
            public void action() {
                super.action();
                exitValue = (int)(Math.round(Math.random())* maxExitValue);
                System.out.println("\tWylosowano: "+ exitValue);
            }

            public int onEnd() {
                return exitValue;
            }
        }

//    protected void takeDown() {
//        System.out.println("zaraz sie usune!");
//    }

    }

