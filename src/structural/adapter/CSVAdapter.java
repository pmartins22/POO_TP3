package structural.adapter;

import java.util.List;

public class CSVAdapter implements AnalyseurVentes{
    private List<VenteModel> ventes = new java.util.ArrayList<>();

    public CSVAdapter() {
        getVentesFromCSV();
    }

    private void getVentesFromCSV() {
        LecteurCSV lecteur = new LecteurCSV("src/structural/adapter/ventes.csv");
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            ventes.add(new VenteModel(lecteur.getLigne(i)));
        }
    }

    public double getTotalVentes() {
        double total = 0.0;
        for (VenteModel vente : ventes) {
            total += vente.montant * vente.quantite;
        }
        return total;
    }

    public int getNbCommandes() {
        int total = 0;
        for (VenteModel vente : ventes) {
            total += vente.quantite;
        }
        return total;
    }

    public java.util.Map<String, Double> getCAParProduit() {
        java.util.Map<String, Double> caParProduit = new java.util.HashMap<>();
        for (VenteModel vente : ventes) {
            caParProduit.putIfAbsent(vente.produit, 0.0);
            caParProduit.put(vente.produit, caParProduit.get(vente.produit) + (vente.montant * vente.quantite));
        }
        return caParProduit;
    }
}
