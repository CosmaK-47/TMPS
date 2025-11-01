package domain;

public class GPS {
    private String version;

    public GPS(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "version='" + version + '\'' +
                '}';
    }
}
