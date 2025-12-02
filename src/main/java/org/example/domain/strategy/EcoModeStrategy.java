package org.example.domain.strategy;

public class EcoModeStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in ECO mode: maximum efficiency.");
    }
}