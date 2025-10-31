package builder;

import domain.Car;

public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructSportsCar() {
        builder.buildMake();
        builder.buildModel();
        builder.buildType();
        builder.buildHorsepower();
        builder.buildSeats();
        return builder.getResult();
    }
}
