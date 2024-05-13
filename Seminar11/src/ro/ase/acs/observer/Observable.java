package ro.ase.acs.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void sendNotification(String message) {
        for (Observer o : observers) {
            o.receiveNotification(message);
        }
    }
}
