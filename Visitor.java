public interface Visitor extends AbstractVisitor{
    void visit(GroupeClient Gc);
    void visit(Client C);
    void visit(Commande Co);
    void visit(Ligne L);

}
