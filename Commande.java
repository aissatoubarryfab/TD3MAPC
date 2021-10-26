import java.util.*;

public class Commande implements PrePostVisitable,Visitable{
    String name;
    private Map<String, Ligne> lignes;

public Commande(String n){
    this.name=n;
    this.lignes=new HashMap<String,Ligne>();
}
public String getName() {
    return this.name;
}

void addLigne(Ligne L){
      this.lignes.put(L.getName(),L);
}

@Override
public void accept(PrePostVisitor Ppv) {
   Ppv.preVisit(this);
   for(Ligne l:lignes.values())
        l.accept(Ppv);
   Ppv.postVisit(this);
}
@Override
public void accept(Visitor V) {
   for(Ligne l:lignes.values()
        l.accept(V);
   V.visit(this);
    
}


}
