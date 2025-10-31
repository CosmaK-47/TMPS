package client;

import builder.*;
import domain.Car;
import factory.CarFactory;
import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // --- Builder Pattern ---
        CarBuilder builder = new SportCarBuilder();
        Director director = new Director(builder);
        Car sportsCar = director.constructSportsCar();
        logger.log("Built via Builder: " + sportsCar);

        // --- Factory Method ---
        Car sedan = CarFactory.createCar("sedan");
        logger.log("Built via Factory: " + sedan);

        Car truck = CarFactory.createCar("truck");
        logger.log("Built via Factory: " + truck);
    }
}
