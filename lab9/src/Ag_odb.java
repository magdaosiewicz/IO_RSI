import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 * Created by Magda on 18.06.2018.
 */
public class Ag_odb extends Agent{


    protected void setup() {
        System.out.println(" :)");

        addBehaviour(new CyclicBehaviour() {
            public void action() {
                ACLMessage aclMessage = receive();
                if (aclMessage != null) {
                    ACLMessage aclMessage1 = aclMessage.createReply();
                    if (aclMessage.getPerformative() == ACLMessage.REQUEST) {
                        System.out.println("The content of the message(request): "+ aclMessage.getContent());
                        aclMessage1.setPerformative(ACLMessage.INFORM);
                        aclMessage1.setContent("wykonalem");
                    } else if(aclMessage.getPerformative() == ACLMessage.CFP){
                        System.out.println("The content of the message(CFP): "+aclMessage.getContent());
                        aclMessage1.setPerformative(ACLMessage.REQUEST);
                        aclMessage1.setContent("raz_jeszcze");
                    } else {
                        aclMessage1.setPerformative(ACLMessage.NOT_UNDERSTOOD);
                        aclMessage1.setContent("I didn't understand.");
                    }
                    myAgent.send(aclMessage1);
                }
                else {
                    block();
                }
            }

        } );
    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");
    }









}
