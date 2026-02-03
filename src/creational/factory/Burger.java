package creational.factory;

public abstract class Burger {
    protected String name;
    protected double price;
    protected String[] ingredients;

    public String getBurger() {
        String res = "";
        res += "Name: " + this.name + '\n';
        res += "Price: " + this.price + " €\n";
        res += "Ingredients: \n";
        for (String ingredient : this.ingredients) {
            res += " - " + ingredient + '\n';
        }
        return res;
    }
}
