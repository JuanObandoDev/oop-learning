public class car {
    public int id;
    public String license;
    public driver driver;
    public int passenger;

    public car(String license, driver driver, int passenger) {
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return ("License: " + license + ", Driver: " + driver.name + ", Passenger: " + passenger);
    }
}
