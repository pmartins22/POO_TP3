package structural.adapter;

public interface AnalyseurVentes {
    double getTotalVentes();
    int getNbCommandes();
    java.util.Map<String, Double> getCAParProduit();
}
