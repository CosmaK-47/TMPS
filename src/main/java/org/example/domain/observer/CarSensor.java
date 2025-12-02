package org.example.domain.observer;

public interface CarSensor {
    void addObserver(CarObserver observer);
    void removeObserver(CarObserver observer);
    void notifyObservers(String message);
}