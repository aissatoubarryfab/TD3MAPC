public class XMLRapportCommandes  implements PrePostVisitor{

    @Override
    public void preVisit(GroupeClient Gc) {
        System.out.println("Groupclient" + Gc.getName());
        
    }

    @Override
    public void preVisit(Client C) {
        System.out.println("preClient" +C.getName());
        
    }

    @Override
    public void preVisit(Commande Co) {
        System.out.println("PreCommande" + Gc.getName());
        
    }

    @Override
    public void preVisit(Ligne L) {
        System.out.println("PreLigne" + L.getName());
        
    }

    @Override
    public void postVisit(GroupeClient Gc) {
        System.out.println("PostGClient" + Gc.getName());
        
    }

    @Override
    public void postVisit(Client C) {
        System.out.println("postClient" + C.getName());
        
    }

    @Override
    public void postVisit(Commande Co) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void postVisit(Ligne L) {
        // TODO Auto-generated method stub
        
    }
    
}
