package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        BurgerFastRestaurant restaurant = new BurgerFastRestaurant("BurgerFast Toulouse");

        ClientVIP client1 = new ClientVIP("client1");
        ClientVIP client2 = new ClientVIP("client2");
        ClientVIP client3 = new ClientVIP("client3");

        restaurant.ajouterClientVIP(client1);
        restaurant.ajouterClientVIP(client2);
        restaurant.ajouterClientVIP(client3);

        restaurant.lancerPromotionFlash("CheeseBurger", 30);

        restaurant.lancerPromotionFlash("ChickenBurger", 25);
    }
}