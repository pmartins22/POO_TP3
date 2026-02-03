package creational.builder;

public class Sandwich {
    private final String pain;

    private final String viande;
    private final String fromage;
    private final String legumes;
    private final String sauce;
    private final boolean grille;

    Sandwich(SandwichBuilder builder) {
        this.pain = builder.pain;
        this.viande = builder.viande;
        this.fromage = builder.fromage;
        this.legumes = builder.legumes;
        this.sauce = builder.sauce;
        this.grille = builder.grille;
    }

    public String getSandwich() {
        String res = "";

        res += "Pain: " + this.pain + '\n';
        res += "Viande: " + this.viande + '\n';
        res += "Fromage: " + this.fromage + '\n';
        res += "Legumes: " + this.legumes + '\n';
        res += "Sauce: " + this.sauce + '\n';
        res += "Grille: " + this.grille + '\n';

        return res;
    }
}
