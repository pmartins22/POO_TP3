package behavioral.strategy;

public class Commande {
    private double prixPlats;
    private double distance;
    private StrategieLivraison strategieLivraison;

    public Commande(double prixPlats, double distance, StrategieLivraison strategieLivraison) {
        this.prixPlats = prixPlats;
        this.distance = distance;
        this.strategieLivraison = strategieLivraison;
    }

    public void setStrategieLivraison(StrategieLivraison strategieLivraison) {
        this.strategieLivraison = strategieLivraison;
    }

    public double calculerFraisLivraison() {
        return strategieLivraison.calculerFrais(distance);
    }

    public double calculerTotal() {
        return prixPlats + calculerFraisLivraison();
    }

    public void afficherRecapitulatif() {
        System.out.println("--- Récapitulatif Commande ---");
        System.out.println("Prix des plats: " + prixPlats + "€");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Mode: " + strategieLivraison.getDescription());
        System.out.println("Frais de livraison: " + calculerFraisLivraison() + "€");
        System.out.println("TOTAL: " + calculerTotal() + "€");
        System.out.println();
    }
}