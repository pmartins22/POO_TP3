package structural.adapter;

public class VenteModel {
    public String date;
    public String produit;
    public double montant;
    public int quantite;

    public VenteModel(String ligne) {
        String[] colonnes = parserLigne(ligne);
        this.date = colonnes[0];
        this.produit = colonnes[1];
        this.montant = Double.parseDouble(colonnes[2]);
        this.quantite = Integer.parseInt(colonnes[3]);

    }

    private String[] parserLigne(String ligne) {
        int counter = 0;
        char[] chars = ligne.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ',') {
                counter++;
                continue;
            }
            if (counter >= 2 && chars[i] == 'x') {
                chars[i] = ',';
            }
        }

        String ligneModifie = new String(chars);
        return ligneModifie.trim().split(",");
    }
}
