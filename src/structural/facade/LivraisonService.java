package structural.facade;

public class LivraisonService {
    public boolean verifierPerimetre(String adresse) {
        System.out.println("✓ Vérification périmètre de livraison: " + adresse);
        return adresse.length() > 5;
    }
}