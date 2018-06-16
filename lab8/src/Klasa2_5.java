import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.ThreadedBehaviourFactory;

/**
 * Created by Magda on 16.06.2018.
 */
public class Klasa2_5 extends Agent {

    protected void setup() {
        System.out.println("My name is " + getLocalName());
        ThreadedBehaviourFactory tbf = new ThreadedBehaviourFactory();
        Behaviour a =new CyclicBehaviour(this) {
            public void action() {
                System.out.println("cyclic_1");
            }
        };
        Behaviour b =new CyclicBehaviour(this) {
            public void action() {
                System.out.println("cyclic_2");
            }
        };

        addBehaviour(tbf.wrap(a));
        addBehaviour(tbf.wrap(b));

    }


}
