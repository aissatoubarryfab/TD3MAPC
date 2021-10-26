public interface PrePostVisitor extends AbstractVisitor{
    void preVisit(GroupeClient Gc);
    void preVisit(Client C);
    void preVisit(Commande Co);
    void preVisit(Ligne L);
    void postVisit(GroupeClient Gc);
    void postVisit(Client C);
    void postVisit(Commande Co);
    void postVisit(Ligne L);
}
