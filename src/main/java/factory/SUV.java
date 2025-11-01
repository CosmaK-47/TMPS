package factory;

import domain.Car;

public class SUV extends CarFactory {
    @Override
    public Car createCar() {
        Car c = new Car();
        c.setMake("Suzuki");
        c.setModel("Vitara");
        c.setSeats(2);
        return c;
    }
}
