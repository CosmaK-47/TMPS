package org.example.builder;

import org.example.domain.car.Car;
import org.example.domain.car.CarType;
import org.example.domain.car.Engine;

public class CarDirector {

    public Car constructLuxuryCar(CarBuilder builder) {
        return builder.createCar()
                .setMake()
                .setModel()
                .setType(CarType.LUXURY)
                .setEngine(new Engine(420, "Petrol"))
                .setSeats(4)
                .build();
    }

    public Car constructEcoCar(CarBuilder builder) {
        return builder.createCar()
                .setMake()
                .setModel()
                .setType(CarType.ECO)
                .setEngine(new Engine(120, "Hybrid"))
                .setSeats(5)
                .build();
    }

    public Car constructSportCar(CarBuilder builder) {
        return builder.createCar()
                .setMake()
                .setModel()
                .setType(CarType.SPORT)
                .setEngine(new Engine(550, "Petrol"))
                .setSeats(2)
                .build();
    }

    public Car constructUltraCar(CarBuilder builder) {
        return builder.createCar()
                .setMake()
                .setModel()
                .setType(CarType.ULTRA)
                .setEngine(new Engine(610, "Electric"))
                .setSeats(4)
                .build();
    }
}
