package org.example.clients;

import org.example.patterns.facade.CarConfiguratorFacade;

public class MainApp {
    public static void main(String[] args) {

        CarConfiguratorFacade facade = new CarConfiguratorFacade();

        facade.configureAndBuyLuxuryBentley();
        System.out.println("--------------------------------------------------");

        facade.configureAndBuyBuickEco();
        System.out.println("--------------------------------------------------");

        facade.configureAndBuyRollsRoyceUltra();
        System.out.println("--------------------------------------------------");
    }
}
