package org.example.domain.strategy;

public class DrivingContext {

    private DrivingStrategy strategy;

    public void setStrategy(DrivingStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        if (strategy != null)
            strategy.drive();
        else
            System.out.println("No driving mode selected.");
    }
}