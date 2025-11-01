package factory;

import domain.Car;

public class Sedan extends CarFactory {
    @Override
    public Car createCar() {
        Car c = new Car();
        c.setMake("Toyota");
        c.setModel("Camry");
        return c;
    }
}
