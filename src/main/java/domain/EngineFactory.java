package domain;

import java.util.Random;

public class EngineFactory {
    private static final Random random = new Random();

    public static Engine createForCategory(String category) {
        switch (category.toLowerCase()) {
            case "truck":
                return createTruckEngine();
            case "suv":
                return createSUVEngine();
            case "sedan":
            default:
                return createSedanEngine();
        }
    }

    private static Engine createSedanEngine() {
        // Possible cylinder counts: 3, 4, or 6
        int cylinders = pick(3, 4, 6);
        String fuel = pickFuel("gasoline", "hybrid", "diesel");
        int horsepower = estimateHorsepower(cylinders, fuel);
        return new Engine(cylinders, fuel, horsepower);
    }

    private static Engine createSUVEngine() {
        // Possible: 4, 6, or 8 cylinders
        int cylinders = pick(4, 6, 8);
        String fuel = pickFuel("gasoline", "diesel");
        int horsepower = estimateHorsepower(cylinders, fuel);
        return new Engine(cylinders, fuel, horsepower);
    }

    private static Engine createTruckEngine() {
        // Trucks: 6 or 8 cylinders, heavy duty
        int cylinders = pick(6, 8);
        String fuel = pickFuel("diesel", "gasoline");
        int horsepower = estimateHorsepower(cylinders, fuel);
        return new Engine(cylinders, fuel, horsepower);
    }

    // Helper functions
    private static int pick(int... options) {
        return options[random.nextInt(options.length)];
    }

    private static String pickFuel(String... options) {
        return options[random.nextInt(options.length)];
    }

    private static int estimateHorsepower(int cylinders, String fuel) {
        int base = 30 * cylinders;
        int variation = random.nextInt(40) + 10; // random 10–50hp variation
        if (fuel.equalsIgnoreCase("diesel")) base += 20; // diesel engines are torque-heavy
        if (fuel.equalsIgnoreCase("hybrid")) base -= 10;
        return base + variation;
    }
}
