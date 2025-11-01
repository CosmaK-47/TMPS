package builder;

import domain.*;

public abstract class CarBuilder {
    protected Car car;

    public void reset() {
        car = new Car();
    }

    public abstract void buildMake();
    public abstract void buildModel();
    public abstract void buildSeats();
    public abstract void buildEngine();
    public abstract void buildTripComputer();
    public abstract void buildGPS();

    public Car getResult() {
        return car;
    }
}
