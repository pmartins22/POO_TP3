package behavioral.strategy;

public class LivraisonExpress implements StrategieLivraison {
    @Override
    public double calculerFrais(double distance) {
        return 5.0 + distance;
    }

    @Override
    public String getDescription() {
        return "Livraison Express (15-20 min)";
    }
}