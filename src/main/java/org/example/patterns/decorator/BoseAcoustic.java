package org.example.patterns.decorator;

public class BoseAcoustic extends CarDecorator {

    private final double extraPrice;

    public BoseAcoustic(ConfigurableCar wrapped, double extraPrice) {
        super(wrapped);
        this.extraPrice = extraPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Bose Acoustic Sound System";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + extraPrice;
    }
}
