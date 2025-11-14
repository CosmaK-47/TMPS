package org.example.factories;

import org.example.builder.*;

public class RollsRoyceFactory implements CarFactory {

    @Override
    public CarBuilder createLuxuryCarBuilder() {
        return new RollsRoyceCarBuilder();
    }

    @Override
    public CarBuilder createSportCarBuilder() {
        return new RollsRoyceCarBuilder();
    }

    @Override
    public CarBuilder createEcoCarBuilder() {
        return new RollsRoyceCarBuilder();
    }

    @Override
    public CarBuilder createUltraCarBuilder() {
        return new RollsRoyceCarBuilder();
    }
}
