package creational.builder;

public class Main {
    public static void main(String[] args) {
        // SANDWICH 1:
        Sandwich sandwich1 = new SandwichBuilder("Brioche").avecFromage("Cheddar").avecSauce("BBQ").grille(true).build();
        System.out.println(sandwich1.getSandwich());

        // SANDWICH 2:
        Sandwich sandwich2 = new SandwichBuilder("Baguette").avecFromage("Roquefort").avecSauce("Blanche").avecLegumes("Onions").build();
        System.out.println(sandwich2.getSandwich());

        // SANDWICH 3:
        Sandwich sandwich3 = new SandwichBuilder("Ciabatta").avecFromage("Emmental").avecSauce("Mayo").avecLegumes("Tomate").avecViande("Poulet").build();
        System.out.println(sandwich3.getSandwich());
    }

}
