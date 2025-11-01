package builder;

import domain.*;

public class SedanCarBuilder extends CarBuilder {
    @Override
    public void buildMake() { car.setMake("Toyota"); }

    @Override
    public void buildModel() { car.setModel("Camry"); }

    @Override
    public void buildSeats() { car.setSeats(5); }

    @Override
    public void buildEngine() {
        car.setEngine(EngineFactory.createForCategory("sedan"));
    }

    @Override
    public void buildTripComputer() { car.setTripComputer(new TripComputer(true)); }

    @Override
    public void buildGPS() { car.setGps(new GPS("v2.1")); }
}
