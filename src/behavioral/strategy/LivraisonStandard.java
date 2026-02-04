package behavioral.strategy;

public class LivraisonStandard implements StrategieLivraison {
    @Override
    public double calculerFrais(double distance) {
        return 2.0 + (distance * 0.5);
    }

    @Override
    public String getDescription() {
        return "Livraison Standard (30-45 min)";
    }
}