package creational.singleton;

import creational.factory.Burger;
import creational.factory.BurgerFactory;

public class Main {
    public static void main(String[] args) {
        // Quatre objets TPE représentant quatre caissiers différents,
        // mais en réalité un seul et même TPE est accédé.:

        // Caissier 1:
        TPE tpe1 = TPE.getInstance();

        tpe1.processPayment(25.00);
        System.out.println("Nouveau total: €" + tpe1.getTotalRevenue());

        // Caissier 2:
        TPE tpe2 = TPE.getInstance();

        tpe2.processPayment(15.50);
        System.out.println("Nouveau total: €" + tpe2.getTotalRevenue());

        // Caissier 3:
        TPE tpe3 = TPE.getInstance();

        tpe3.processPayment(30.75);
        System.out.println("Nouveau total: €" + tpe3.getTotalRevenue());

        // Caissier 4:

        // Affichage du chiffre d'affaires total:
        TPE tpe4 = TPE.getInstance();

        System.out.println("Chiffre d'affaires total: €" + tpe4.getTotalRevenue());

        // Réinitialisation du chiffre d'affaires:

        tpe4.resetTotalRevenue();
        System.out.println("TPE reinitialise, nouveau total: €" + tpe4.getTotalRevenue());
    }

}
