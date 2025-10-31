package builder;

import domain.Car;

public abstract class CarBuilder {
    protected Car car;

    public CarBuilder() {
        car = new Car();
    }

    public abstract void buildMake();
    public abstract void buildModel();
    public abstract void buildType();
    public abstract void buildHorsepower();
    public abstract void buildSeats();

    public Car getResult() {
        return car;
    }
}
