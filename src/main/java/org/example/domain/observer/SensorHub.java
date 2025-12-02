package org.example.domain.observer;

import java.util.ArrayList;
import java.util.List;

public class SensorHub implements CarSensor {

    private List<CarObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(CarObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(CarObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (CarObserver o : observers) {
            o.update(message);
        }
    }

    public void event(String message) {
        System.out.println("[SENSOR EVENT] " + message);
        notifyObservers(message);
    }
}