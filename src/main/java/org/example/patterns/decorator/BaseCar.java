package org.example.patterns.decorator;

import org.example.domain.car.Car;

public class BaseCar implements ConfigurableCar {

    private final Car car;
    private final double basePrice;

    public BaseCar(Car car, double basePrice) {
        this.car = car;
        this.basePrice = basePrice;
    }

    @Override
    public String getDescription() {
        return car.getMake() + " " + car.getModel() + " (" + car.getType() + ")";
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
