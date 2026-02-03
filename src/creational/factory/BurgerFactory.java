package creational.factory;

public class BurgerFactory {
    public static Burger create(String burger) {
        return switch (burger.toLowerCase()) {
            case "chicken burger" -> new ChickenBurger();
            case "cheese burger" -> new CheeseBurger();
            case "veggie burger" -> new BurgerVeggie();
            default -> throw new IllegalArgumentException("Unknown burger type: " + burger);
        };
    }
}
