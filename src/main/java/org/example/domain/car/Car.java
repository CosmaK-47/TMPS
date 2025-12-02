package org.example.domain.car;

public class Car {

    private String model;
    private boolean engineRunning = false;

    public Car(String model) {
        this.model = model;
    }

    public void startEngine() {
        engineRunning = true;
        System.out.println(model + ": Engine started.");
    }

    public void stopEngine() {
        engineRunning = false;
        System.out.println(model + ": Engine stopped.");
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void enableAutopilot() {
        if (engineRunning) {
            System.out.println(model + ": Autopilot activated.");
        } else {
            System.out.println(model + ": Cannot activate autopilot (engine off).");
        }
    }
}
