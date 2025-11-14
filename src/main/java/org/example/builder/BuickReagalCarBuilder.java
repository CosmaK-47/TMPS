package org.example.builder;

import org.example.domain.car.CarType;
import org.example.domain.car.Engine;

public class BuickReagalCarBuilder extends CarBuilder {

    @Override
    public CarBuilder setMake() {
        car.setMake("Buick");
        return this;
    }

    @Override
    public CarBuilder setModel() {
        car.setModel("Regal");
        return this;
    }

    @Override
    public CarBuilder setType(CarType type) {
        car.setType(type);
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }
}
