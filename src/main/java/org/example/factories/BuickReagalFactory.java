package org.example.factories;

import org.example.builder.*;

public class BuickReagalFactory implements CarFactory {

    @Override
    public CarBuilder createLuxuryCarBuilder() {
        return new BuickReagalCarBuilder();
    }

    @Override
    public CarBuilder createSportCarBuilder() {
        return new BuickReagalCarBuilder();
    }

    @Override
    public CarBuilder createEcoCarBuilder() {
        return new BuickReagalCarBuilder();
    }

    @Override
    public CarBuilder createUltraCarBuilder() {
        return new BuickReagalCarBuilder();
    }
}
