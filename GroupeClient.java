import java.util.*;

public final class GroupeClient implements PrePostVisitable,Visitable{
        private String name;
        private Map<String,Client> clients = null;
    
     
    
        public GroupeClient(String name) {
            this.name = name;
            this.clients = new HashMap<String,Client>();
        }
        
        public String getName() {
            return name;
        }
        
        public Collection<Client> getClients() {
            return clients.values();
        }
        
        public void addClient(Client c) {
            this.clients.put(c.getName(),c);
        }
        
        public void addCommande(String cname, Commande cde) throws MonException {
            Client c = clients.get(cname);
            if (c!=null) { c.addCommande(cde); }
            else throw new MonException("client inconnu");
        }
        
        public void addLigne(String cname, String cdename, Ligne l) throws MonException { // manque dans UML
            Client c = clients.get(cname);
            if (c!=null) { c.addLigne(cdename, l);}
            else throw new MonException("client inconnu");
        }

        @Override
        public void accept(Visitor V) {
            for(Client C:clients.values()){
                C.accept(V);
            }
            V.visit(this);
            
        }

        @Override
        public void accept(PrePostVisitor Ppv) {
            Ppv.preVisit(this);
            for(Client C:clients.values()){
                C.accept(Ppv);
            }
            Ppv.postVisit(this);
            
        }
            
        }
        
    
}
