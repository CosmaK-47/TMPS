package builder;

import domain.*;

public class TruckCarBuilder extends CarBuilder {

    @Override
    public void buildMake() { car.setMake("Ford"); }

    @Override
    public void buildModel() { car.setModel("F-150"); }

    @Override
    public void buildSeats() { car.setSeats(3); }

    @Override
    public void buildEngine() {
        car.setEngine(EngineFactory.createForCategory("truck"));
    }

    @Override
    public void buildTripComputer() {
        car.setTripComputer(new TripComputer(false));
    }

    @Override
    public void buildGPS() {
        car.setGps(new GPS("v1.5"));
    }
}
