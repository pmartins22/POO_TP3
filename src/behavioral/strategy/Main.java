package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Commande commande1 = new Commande(25.50, 5.0, new LivraisonStandard());
        commande1.afficherRecapitulatif();

        Commande commande2 = new Commande(42.00, 3.0, new LivraisonExpress());
        commande2.afficherRecapitulatif();

        Commande commande3 = new Commande(18.75, 0.0, new ClickAndCollect());
        commande3.afficherRecapitulatif();

        // Changement de stratégie de livraison pour la commande1

        commande1.setStrategieLivraison(new LivraisonExpress());
        commande1.afficherRecapitulatif();
    }
}