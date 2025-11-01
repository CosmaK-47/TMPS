package client;

import builder.*;
import domain.Car;
import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Director director = new Director();

        try {
            // Sedan
            CarBuilder sedanBuilder = new SedanCarBuilder();
            director.setBuilder(sedanBuilder);
            Car sedan = director.constructCar();
            logger.log("Built Sedan: " + sedan);

            // SUV
            CarBuilder suvBuilder = new SUVCarBuilder();
            director.setBuilder(suvBuilder);
            Car suv = director.constructCar();
            logger.log("Built SUV: " + suv);

            // Truck
            CarBuilder truckBuilder = new TruckCarBuilder();
            director.setBuilder(truckBuilder);
            Car truck = director.constructCar();
            logger.log("Built Truck: " + truck);

            // Simulate an error intentionally
            CarBuilder badBuilder = null;
            director.setBuilder(badBuilder);  // ⚠️ This will cause a NullPointerException
            Car badCar = director.constructCar();
            logger.log("Built Bad Car: " + badCar);

        } catch (Exception e) {
            logger.error("Error occurred while building a car: " + e.getMessage());
        }
    }
}
