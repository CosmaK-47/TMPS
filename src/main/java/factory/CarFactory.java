package factory;

import domain.Car;

public class CarFactory {

    public static Car createCar(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "sedan":
                return createSedan();
            case "truck":
                return createTruck();
            case "sports":
                return createSports();
            default:
                return createSedan();
        }
    }

    private static Car createSedan() {
        Car c = new Car();
        c.setMake("Toyota");
        c.setModel("Camry");
        c.setType("Sedan");
        c.setHorsepower(203);
        c.setSeats(5);
        return c;
    }

    private static Car createTruck() {
        Car c = new Car();
        c.setMake("Ford");
        c.setModel("F-150");
        c.setType("Truck");
        c.setHorsepower(400);
        c.setSeats(3);
        return c;
    }

    private static Car createSports() {
        Car c = new Car();
        c.setMake("Porsche");
        c.setModel("911");
        c.setType("Sports");
        c.setHorsepower(443);
        c.setSeats(2);
        return c;
    }
}
