import jade.content.onto.basic.Action;
import jade.content.onto.basic.Result;
import jade.core.AID;
import jade.core.Agent;
import jade.core.ContainerID;
import jade.core.behaviours.WakerBehaviour;
import jade.domain.FIPANames;
import jade.domain.JADEAgentManagement.CreateAgent;
import jade.domain.JADEAgentManagement.JADEManagementOntology;
import jade.domain.JADEAgentManagement.WhereIsAgentAction;
import jade.lang.acl.ACLMessage;
import jade.proto.AchieveREInitiator;

/**
 * Created by Magda on 19.06.2018.
 */
public class Request2AMSAgent extends Agent {


    public void setup() {

        getContentManager().registerLanguage(new jade.content.lang.sl.SLCodec(0));
        getContentManager().registerOntology(JADEManagementOntology.getInstance());

        CreateAgent ca = new CreateAgent();
        ca.setAgentName("john");
        ca.setClassName("jade.core.Agent");
        ca.setContainer(new ContainerID("Main-Container", null));

        Action actExpr = new Action(getAMS(), ca);

        ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
        request.addReceiver(getAMS());
        request.setOntology(JADEManagementOntology.getInstance().getName());
        request.setLanguage(FIPANames.ContentLanguage.FIPA_SL0);
        request.setProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST);
        try {
            getContentManager().fillContent(request, actExpr);
            addBehaviour(new AchieveREInitiator(this, request) {
                protected void handleInform(ACLMessage inform) {
                    System.out.println("Agent successfully created");
                }
                protected void handleFailure(ACLMessage failure) {
                    System.out.println("Error creating agent.\n"+failure);
                }
            } );
        }
        catch (Exception e) {
            e.printStackTrace();
        }



        /** From page 109
         * This code shows how to request to the AMS to perform
         * the "where-is-agent" action to identify where agent john currently lives;
         * and, finally, how to retrieve the information from the AMS reply.
         * We inserted the code into a WakerBehaviour in order to wait until
         * 'john' is actually created.
         **/

        addBehaviour(new WakerBehaviour(this, 30000) {
            protected void onWake() {
                // Create a request to perform the where-is-agent action
                WhereIsAgentAction wa = new WhereIsAgentAction();
                wa.setAgentIdentifier(new AID("john", AID.ISLOCALNAME));
                Action actExpr = new Action(getAMS(), wa);
                ACLMessage request = new ACLMessage(ACLMessage.REQUEST);
                request.addReceiver(getAMS());
                request.setOntology(JADEManagementOntology.getInstance().getName());
                request.setLanguage(FIPANames.ContentLanguage.FIPA_SL0);
                request.setProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST);
                try {
                    getContentManager().fillContent(request, actExpr);
                    addBehaviour(new AchieveREInitiator(myAgent, request) {
                        protected void handleInform(ACLMessage inform) {
                            try {
                                Result r = (Result)myAgent.getContentManager().extractContent(inform);
                                ContainerID cid = (ContainerID) r.getValue();
                                System.out.println("john is in "+cid);
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



}
