package org.example.domain.strategy;

public class SportModeStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in SPORT mode: maximum acceleration.");
    }
}