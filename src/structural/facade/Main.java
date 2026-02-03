package structural.facade;

public class Main {
    public static void main(String[] args) {
        CommandeValidationFacade facade = new CommandeValidationFacade();

        boolean resultat = facade.validerCommande(
                "user123",
                "CheeseBurger",
                25,
                "123 Rue de Paris, Toulouse"
        );

        System.out.println("\nRésultat final: " + (resultat ? "ACCEPTÉE" : "REFUSÉE"));
    }
}