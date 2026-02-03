package structural.facade;

import java.time.LocalTime;

public class CuisineService {
    public boolean verifierTempsPreparation(int tempsEstime) {
        System.out.println("✓ Vérification temps de préparation: " + tempsEstime + " min");
        LocalTime maintenant = LocalTime.now();
        LocalTime fermeture = LocalTime.of(22, 0);
        return maintenant.plusMinutes(tempsEstime).isBefore(fermeture);
    }
}