package org.example.domain.options;

public class Option {

    private final String name;
    private final double price;
    private final boolean premium;

    public Option(String name, double price, boolean premium) {
        this.name = name;
        this.price = price;
        this.premium = premium;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isPremium() { return premium; }

    @Override
    public String toString() {
        return name + " (" + price + " EUR)";
    }
}
