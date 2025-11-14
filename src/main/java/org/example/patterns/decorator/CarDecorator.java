package org.example.patterns.decorator;

public abstract class CarDecorator implements ConfigurableCar {

    protected final ConfigurableCar wrapped;

    protected CarDecorator(ConfigurableCar wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription();
    }

    @Override
    public double getPrice() {
        return wrapped.getPrice();
    }
}
