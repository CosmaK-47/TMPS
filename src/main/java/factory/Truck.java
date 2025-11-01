package factory;

import domain.Car;

public class Truck extends CarFactory {
    @Override
    public Car createCar() {
        Car c = new Car();
        c.setMake("Ford");
        c.setModel("F-150");
        c.setSeats(3);
        return c;
    }
}
