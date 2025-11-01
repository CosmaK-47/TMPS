package domain;

public class Car {
    private String make;
    private String model;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setSeats(int seats) { this.seats = seats; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public void setTripComputer(TripComputer tripComputer) { this.tripComputer = tripComputer; }
    public void setGps(GPS gps) { this.gps = gps; }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
