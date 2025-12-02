package org.example.domain.observer;

public class TemperatureObserver implements CarObserver {
    @Override
    public void update(String message) {
        System.out.println("Temperature system received: " + message);
    }
}