package org.example.domain.car;

public class Car {

    private String make;
    private String model;
    private CarType type;
    private Engine engine;
    private int seats;

    public Car() {}

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public CarType getType() { return type; }
    public Engine getEngine() { return engine; }
    public int getSeats() { return seats; }

    @Override
    public String toString() {
        return "Car{make=" + make +
                ", model=" + model +
                ", type=" + type +
                ", engine=" + engine +
                ", seats=" + seats + '}';
    }
}
