package org.example.patterns.decorator;

public class GpsDecorator extends CarDecorator {

    private final double extraPrice;

    public GpsDecorator(ConfigurableCar wrapped, double extraPrice) {
        super(wrapped);
        this.extraPrice = extraPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + GPS Navigation";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + extraPrice;
    }
}
