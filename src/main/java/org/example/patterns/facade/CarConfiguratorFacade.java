package org.example.patterns.facade;

import org.example.builder.*;
import org.example.domain.car.Car;
import org.example.factories.*;
import org.example.patterns.adapter.*;
import org.example.patterns.decorator.*;

public class CarConfiguratorFacade {

    private final PaymentService paymentService;
    private final CarDirector director;

    private final CarFactory bentleyFactory;
    private final CarFactory buickFactory;
    private final CarFactory rollsFactory;

    public CarConfiguratorFacade() {
        this.director = new CarDirector();

        this.bentleyFactory = new BentleyFactory();
        this.buickFactory = new BuickReagalFactory();
        this.rollsFactory = new RollsRoyceFactory();

        this.paymentService = new PaymentAdapter(new LegacyPaymentProcessor());
    }


    public void configureAndBuyLuxuryBentley() {

        CarBuilder builder = bentleyFactory.createLuxuryCarBuilder();
        Car car = director.constructLuxuryCar(builder);

        ConfigurableCar configurable = new BaseCar(car, 30000);

        configurable = new GpsDecorator(configurable, 700);
        configurable = new BoseAcoustic(configurable, 1500);

        System.out.println("=== Final Bentley Configuration ===");
        System.out.println("Description: " + configurable.getDescription());
        System.out.println("Price: " + configurable.getPrice());

        PaymentResult res = paymentService.pay(configurable.getPrice(), "CARD_12345");

        System.out.println("Payment: " + res.status());
    }


    public void configureAndBuyBuickEco() {

        CarBuilder builder = buickFactory.createEcoCarBuilder();
        Car car = director.constructEcoCar(builder);

        ConfigurableCar configurable = new BaseCar(car, 18000);

        configurable = new GpsDecorator(configurable, 500);

        System.out.println("=== Final Buick Configuration ===");
        System.out.println("Description: " + configurable.getDescription());
        System.out.println("Price: " + configurable.getPrice());

        PaymentResult res = paymentService.pay(configurable.getPrice(), "CARD_77777");

        System.out.println("Payment: " + res.status());
    }


    public void configureAndBuyRollsRoyceUltra() {

        CarBuilder builder = rollsFactory.createUltraCarBuilder();
        Car car = director.constructUltraCar(builder);

        ConfigurableCar configurable = new BaseCar(car, 50000);

        configurable = new BoseAcoustic(configurable, 2000);

        System.out.println("=== Final Rolls Royce Configuration ===");
        System.out.println("Description: " + configurable.getDescription());
        System.out.println("Price: " + configurable.getPrice());

        PaymentResult res = paymentService.pay(configurable.getPrice(), "CARD_99999");

        System.out.println("Payment: " + res.status());
    }
}
