package creational.singleton;

public class TPE {
    public static TPE instance;

    private double totalRevenue;

    private TPE() {
        this.totalRevenue = 0;
    }

    public static TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }

    public void processPayment(double amount) {
        this.totalRevenue += amount;
    }

    public double getTotalRevenue() {
        return this.totalRevenue;
    }

    public void resetTotalRevenue() {
        this.totalRevenue = 0;
    }
}
