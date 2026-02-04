package behavioral.observer;

public class ClientVIP implements Observer {
    private String nom;

    public ClientVIP(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("[" + nom + "] a reçu: " + message);
    }

    public String getNom() {
        return nom;
    }
}