package creational.builder;

public class SandwichBuilder {
    protected String pain;

    protected String viande = "Aucune";
    protected String fromage = "Aucun";
    protected String legumes = "Aucun";
    protected String sauce = "Aucune";
    protected boolean grille = false;

    public SandwichBuilder(String pain) {
        if (pain == null || pain.trim().isEmpty()) {
            throw new IllegalArgumentException("Le pain est obligatoire !");
        }
        this.pain = pain;
    }

    public SandwichBuilder avecViande(String viande) {
        this.viande = viande;
        return this;
    }

    public SandwichBuilder avecFromage(String fromage) {
        this.fromage = fromage;
        return this;
    }

    public SandwichBuilder avecLegumes(String legumes) {
        this.legumes = legumes;
        return this;
    }

    public SandwichBuilder avecSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder grille(boolean grille) {
        this.grille = grille;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this);
    }
}
