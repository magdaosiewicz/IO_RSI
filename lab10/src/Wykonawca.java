import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

/**
 * Created by Magda on 19.06.2018.
 */
public class Wykonawca extends Agent{
    protected void setup() {

        //Rejestracja usługi:
        // 1. Przygotowanie opisu agenta:
        DFAgentDescription dfd=new DFAgentDescription();
        dfd.setName(getAID());
        ServiceDescription sd=new ServiceDescription();
        sd.setType("POTEGA");
        sd.setName(getName());
        dfd.addServices(sd);
        //2. Rejestracja w serwisie:
        try{
            DFService.register(this,dfd);
        }catch (FIPAException fe){
            fe.printStackTrace();
        }
    }
    protected void takeDown() {
        System.out.println("zaraz sie usune!");
        //3. Wyrejestrowanie z serwisu
        try{
            DFService.deregister(this);
        }catch (FIPAException fe){
            fe.printStackTrace();
        }
    }
}
