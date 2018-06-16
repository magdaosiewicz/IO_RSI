import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.ParallelBehaviour;

/**
 * Created by Magda on 16.06.2018.
 */
public class Klasa2_3 extends Agent {


    private int step=0;
    protected void setup() {

        System.out.println("startuje");
        final ParallelBehaviour par = new ParallelBehaviour();

        par.addSubBehaviour( new OneShotBehaviour()
        {
            public void action() { System.out.println( "pierwszy krok!" ); }
        });

        par.addSubBehaviour( new OneShotBehaviour()
        {
            public void action() { System.out.println( "drugi krok!" ); }
        });

        par.addSubBehaviour( new OneShotBehaviour()
        {
            public void action() {
                System.out.println( "trzeci krok!" );
                removeBehaviour(par);
                System.out.println( "usuwam!" );
            }
        });
        addBehaviour( par );

    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }


}
