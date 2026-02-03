package creational.factory;

public class BurgerVeggie extends Burger{
    public BurgerVeggie() {
        this.name = "Veggie Burger";
        this.price = 8.00;
        this.ingredients = new String[]{"Pain complet", "Salade", "Tomate", "Carotte"};
    }

}
