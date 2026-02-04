package behavioral.strategy;

public class ClickAndCollect implements StrategieLivraison {
    @Override
    public double calculerFrais(double distance) {
        return 0.0;
    }

    @Override
    public String getDescription() {
        return "Click & Collect (retrait sur place)";
    }
}