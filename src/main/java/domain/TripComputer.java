package domain;

public class TripComputer {
    private boolean active;

    public TripComputer(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "TripComputer{" +
                "active=" + active +
                '}';
    }
}
