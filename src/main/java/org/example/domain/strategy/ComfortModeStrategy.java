package org.example.domain.strategy;

public class ComfortModeStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in COMFORT mode: smooth ride.");
    }
}