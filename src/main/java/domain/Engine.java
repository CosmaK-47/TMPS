package domain;

public class Engine {
    private final int cylinders;
    private final String fuelType;
    private final int horsepower;

    public Engine(int cylinders, String fuelType, int horsepower) {
        this.cylinders = cylinders;
        this.fuelType = fuelType;
        this.horsepower = horsepower;
    }

    public int getCylinders() { return cylinders; }
    public String getFuelType() { return fuelType; }
    public int getHorsepower() { return horsepower; }

    @Override
    public String toString() {
        return "Engine{" +
                cylinders + "cyl, " +
                fuelType + ", " +
                horsepower + "hp}";
    }
}
