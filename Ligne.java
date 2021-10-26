public class Ligne implements PrePostVisitable,Visitable{
    String name;
    int sum;

    public Ligne(String n){
        this.name=n;
    }
   public Ligne(String n, int s){
       this.name=n;
       this.sum=s;
    }
    
    public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getSum() {
    return sum;
}
public void setSum(int sum) {
    this.sum = sum;
}
   
    @Override
    public void accept(PrePostVisitor Ppv) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void accept(Visitor V) {
        // TODO Auto-generated method stub
        
    }
    
}
