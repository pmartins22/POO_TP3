package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {
    private String nom;
    private List<ClientVIP> clientsVIP;

    public BurgerFastRestaurant(String nom) {
        this.nom = nom;
        this.clientsVIP = new ArrayList<>();
    }

    public void ajouterClientVIP(ClientVIP client) {
        clientsVIP.add(client);
        System.out.println("Client VIP ajouté: " + client.getNom());
    }

    public void lancerPromotionFlash(String description, double reduction) {
        System.out.println("\n=== " + nom + " lance une promotion flash ===");
        Promotion promo = new Promotion(description, reduction);

        for (ClientVIP client : clientsVIP) {
            promo.ajouterObserver(client);
        }

        promo.notifierClients();
    }
}