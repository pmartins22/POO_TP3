package creational.factory;

public class ChickenBurger extends Burger{
    public ChickenBurger() {
        this.name = "Chicken Burger";
        this.price = 9.00;
        this.ingredients = new String[]{"Pain burger", "Poulet pané croustillant", "Sauce BBQ"};
    }
}
