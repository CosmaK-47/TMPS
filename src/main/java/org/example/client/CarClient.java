package org.example.client;
import org.example.domain.car.Car;
import org.example.domain.command.*;
import org.example.domain.observer.*;
import org.example.domain.strategy.*;

public class CarClient {
    public static void main(String[] args) {

        // --- STRATEGY DEMO ---
        DrivingContext driving = new DrivingContext();
        driving.setStrategy(new SportModeStrategy());
        driving.execute();

        driving.setStrategy(new EcoModeStrategy());
        driving.execute();

        // --- OBSERVER DEMO ---
        SensorHub hub = new SensorHub();
        hub.addObserver(new EngineObserver());
        hub.addObserver(new BatteryObserver());
        hub.addObserver(new TemperatureObserver());

        hub.event("Engine temperature rising!");
        hub.event("Battery at 20%!");

        // --- COMMAND DEMO ---
        Car car = new Car("BMW M5");

        CarRemote remote = new CarRemote();

        remote.setCommand(new StartEngineCommand(car));
        remote.pressButton();

        remote.setCommand(new EnableAutopilotCommand(car));
        remote.pressButton();

        remote.setCommand(new StopEngineCommand(car));
        remote.pressButton();
    }
}
