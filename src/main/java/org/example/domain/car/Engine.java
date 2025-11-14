package org.example.domain.car;

public class Engine {

    private int horsepower;
    private String fuelType;

    public Engine(int horsepower, String fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Engine{hp=" + horsepower + ", fuelType='" + fuelType + "'}";
    }
}
