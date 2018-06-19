import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

/**
 * Created by Magda on 19.06.2018.
 */
public class Ag_pl extends Agent {



    private MessageTemplate template = MessageTemplate.MatchLanguage("polski");
    protected void setup() {

        addBehaviour(new CyclicBehaviour(this) {
            public void action() {

                ACLMessage msg = myAgent.receive(template);
                if (msg != null) {
                    System.out.println("The Message from agent : " + msg.getSender().getName());
                    System.out.println("The zontent of the message " + msg.getContent());
                }
                else {
                    block();
                }
            }
        } );
    }

}
