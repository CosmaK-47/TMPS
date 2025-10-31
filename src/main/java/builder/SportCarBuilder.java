package builder;

public class SportCarBuilder extends CarBuilder {

    public SportCarBuilder() {
        super();
    }

    @Override
    public void buildMake() {
        car.setMake("Ferrari");
    }

    @Override
    public void buildModel() {
        car.setModel("F8 Tributo");
    }

    @Override
    public void buildType() {
        car.setType("Sports");
    }

    @Override
    public void buildHorsepower() {
        car.setHorsepower(710);
    }

    @Override
    public void buildSeats() {
        car.setSeats(2);
    }
}
