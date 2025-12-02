package org.example.domain.observer;

public class BatteryObserver implements CarObserver {
    @Override
    public void update(String message) {
        System.out.println("Battery system received: " + message);
    }
}