package creational.factory;

public class Main {
    public static void main(String[] args) {
        // VEGGIE BURGER:
        Burger veggieBurger = BurgerFactory.create("veggie burger");
        System.out.println(veggieBurger.getBurger());

        // CHEESE BURGER:
        Burger cheeseBurger = BurgerFactory.create("cheese burger");
        System.out.println(cheeseBurger.getBurger());

        // CHICKEN BURGER:
        Burger chickenBurger = BurgerFactory.create("chicken burger");
        System.out.println(chickenBurger.getBurger());
    }

}
