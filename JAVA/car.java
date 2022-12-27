public class car {
    public int id;
    public String license;
    public String driver;
    public int passenger;

    public car(String license, String driver, int passenger) {
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return ("License: " + license + ", Driver: " + driver + ", Passenger: " + passenger);
    }
}
