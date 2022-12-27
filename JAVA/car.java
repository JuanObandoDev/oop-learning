public class car {
    public int id;
    public String license;
    public account driver;
    public int passenger;

    public car(String license, account driver, int passenger) {
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return ("License: " + license + ", Driver: " + driver.name + ", Passenger: " + passenger);
    }
}
