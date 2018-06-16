import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class Klasa_8 extends Agent {

    protected void setup() {
        System.out.println("startuje!");

        //a)co 2s "maly Tick"
        Behaviour smallTick=new TickerBehaviour(this,2000) {
            @Override
            protected void onTick() {
                System.out.println("maly tick");
            }
        };

        //b) co 5s "duzy Tick"
        final Behaviour bigTick=new TickerBehaviour(this,5000) {
            @Override
            protected void onTick() {
                System.out.println("duzy tick");
            }
        };
        addBehaviour(smallTick);
        addBehaviour(bigTick);

        addBehaviour(new WakerBehaviour(this, 50000) {
            protected void handleElapsedTimeout() {
                removeBehaviour(bigTick);
            }
        });

        addBehaviour(new WakerBehaviour(this, 100000) {
            protected void handleElapsedTimeout() {
                myAgent.doDelete();
            }
        });


    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }

}