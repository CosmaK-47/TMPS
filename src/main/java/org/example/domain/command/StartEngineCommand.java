package org.example.domain.command;

import org.example.domain.car.Car;

public class StartEngineCommand implements CarCommand {

    private Car car;

    public StartEngineCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }
}
