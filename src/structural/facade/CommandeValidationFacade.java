package structural.facade;

public class CommandeValidationFacade {
    private UtilisateurService utilisateurService;
    private IngredientService ingredientService;
    private CuisineService cuisineService;
    private LivreurService livreurService;
    private LivraisonService livraisonService;

    public CommandeValidationFacade() {
        this.utilisateurService = new UtilisateurService();
        this.ingredientService = new IngredientService();
        this.cuisineService = new CuisineService();
        this.livreurService = new LivreurService();
        this.livraisonService = new LivraisonService();
    }

    public boolean validerCommande(String userId, String produit, int tempsPrepa, String adresse) {
        System.out.println("=== Validation de commande ===");

        if (!utilisateurService.verifierConnexion(userId)) {
            System.out.println("✗ Utilisateur non connecté");
            return false;
        }

        if (!ingredientService.verifierDisponibilite(produit)) {
            System.out.println("✗ Ingrédients non disponibles");
            return false;
        }

        if (!cuisineService.verifierTempsPreparation(tempsPrepa)) {
            System.out.println("✗ Pas assez de temps avant fermeture");
            return false;
        }

        if (!livreurService.verifierDisponibilite()) {
            System.out.println("✗ Aucun livreur disponible");
            return false;
        }

        if (!livraisonService.verifierPerimetre(adresse)) {
            System.out.println("✗ Adresse hors périmètre");
            return false;
        }

        System.out.println("✓ Commande validée avec succès!");
        return true;
    }
}