package structural.facade;

public class IngredientService {
    public boolean verifierDisponibilite(String produit) {
        System.out.println("✓ Vérification disponibilité ingrédients pour: " + produit);
        return true;
    }
}