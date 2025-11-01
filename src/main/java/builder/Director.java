package builder;

import domain.Car;

public class Director {
    private CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructCar() {
        builder.reset();
        builder.buildMake();
        builder.buildModel();
        builder.buildSeats();
        builder.buildEngine();
        builder.buildTripComputer();
        builder.buildGPS();
        return builder.getResult();
    }
}
