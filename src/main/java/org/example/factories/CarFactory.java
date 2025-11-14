package org.example.factories;

import org.example.builder.CarBuilder;

public interface CarFactory {
    CarBuilder createLuxuryCarBuilder();
    CarBuilder createSportCarBuilder();
    CarBuilder createEcoCarBuilder();
    CarBuilder createUltraCarBuilder();
}
