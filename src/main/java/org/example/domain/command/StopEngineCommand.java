package org.example.domain.command;

import org.example.domain.car.Car;

public class StopEngineCommand implements CarCommand {

    private Car car;

    public StopEngineCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopEngine();
    }
}