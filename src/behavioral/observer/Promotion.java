package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Promotion {
    private String description;
    private double reduction;
    private List<Observer> observers;

    public Promotion(String description, double reduction) {
        this.description = description;
        this.reduction = reduction;
        this.observers = new ArrayList<>();
    }

    public void ajouterObserver(Observer observer) {
        observers.add(observer);
    }

    public void retirerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifierClients() {
        String message = "PROMO FLASH: " + description + " - " + reduction + "% de réduction!";
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public String getDescription() {
        return description;
    }
}