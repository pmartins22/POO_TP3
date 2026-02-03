package structural.adapter;

public class Main {
    public static void main(String[] args) {
        BurgerAnalytics analytics = new BurgerAnalytics(new CSVAdapter());
        analytics.genererRapport();
    }
}
