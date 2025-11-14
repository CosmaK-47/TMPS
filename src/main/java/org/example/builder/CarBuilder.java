package org.example.builder;

import org.example.domain.car.Car;
import org.example.domain.car.CarType;
import org.example.domain.car.Engine;

public abstract class CarBuilder {

    protected Car car;

    public CarBuilder createCar() {
        car = new Car();
        return this;
    }

    public abstract CarBuilder setMake();
    public abstract CarBuilder setModel();
    public abstract CarBuilder setType(CarType type);
    public abstract CarBuilder setEngine(Engine engine);
    public abstract CarBuilder setSeats(int seats);

    public Car build() {
        return car;
    }
}
