package org.example.domain.observer;

public class EngineObserver implements CarObserver {
    @Override
    public void update(String message) {
        System.out.println("Engine system received: " + message);
    }
}