package builder;

import domain.*;

public class SUVCarBuilder extends CarBuilder {

    @Override
    public void buildMake() { car.setMake("Suzuki"); }

    @Override
    public void buildModel() { car.setModel("Vitara"); }

    @Override
    public void buildSeats() { car.setSeats(5); }

    @Override
    public void buildEngine() {
        car.setEngine(EngineFactory.createForCategory("suv"));
    }

    @Override
    public void buildTripComputer() {
        car.setTripComputer(new TripComputer(true));
    }

    @Override
    public void buildGPS() {
        car.setGps(new GPS("v1.8"));
    }
}
