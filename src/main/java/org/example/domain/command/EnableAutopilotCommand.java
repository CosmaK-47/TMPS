package org.example.domain.command;

import org.example.domain.car.Car;

public class EnableAutopilotCommand implements CarCommand {

    private Car car;

    public EnableAutopilotCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.enableAutopilot();
    }
}