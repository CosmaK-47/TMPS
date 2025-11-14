package org.example.factories;

import org.example.builder.*;

public class BentleyFactory implements CarFactory {

    @Override
    public CarBuilder createLuxuryCarBuilder() {
        return new BentleyCarBuilder();
    }

    @Override
    public CarBuilder createSportCarBuilder() {
        return new BentleyCarBuilder();
    }

    @Override
    public CarBuilder createEcoCarBuilder() {
        return new BentleyCarBuilder();
    }

    @Override
    public CarBuilder createUltraCarBuilder() {
        return new BentleyCarBuilder();
    }
}
