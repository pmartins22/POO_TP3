package creational.factory;

public class CheeseBurger extends Burger{
    public CheeseBurger() {
        this.name = "Cheese Burger";
        this.price = 10.00;
        this.ingredients = new String[]{"Pain sesame", "Steak haché", "Cheddar fondu"};
    }
}
