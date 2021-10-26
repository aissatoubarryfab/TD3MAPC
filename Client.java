import java.util.*;

public final class Client implements PrePostVisitable,Visitable{

        private String name;
        protected Map<String,Commande> commandes ;
        
        public Client(String name) {
            this.name = name;
            this.commandes = new HashMap<>();
        }
        
        public String getName() {
            return name;
        }
        
        public void addCommande(Commande c) {
            this.commandes.put(c.getName(),c);
        }
        
        public void addLigne(String cdename, Ligne l) throws MonException {
            Commande c = this.commandes.get(cdename);
            if (c!=null) { c.addLigne(l); }
            else throw new MonException("commande inconnue");
        }

        @Override
        public void accept(PrePostVisitor Ppv) {
            Ppv.preVisit(this);
            for(Commande c:commandes.values()){
                c.accept(Ppv);
            }
            Ppv.postVisit(this);
            
        }

        @Override
        public void accept(Visitor V) {
           for(Commande c:commandes.values())
           c.accept(V);
           V.visit(this);
            
        }
        
     
    
    
    }
