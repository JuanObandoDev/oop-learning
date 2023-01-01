public class car {
    private int id;
    private String license;
    private driver driver;
    protected int passenger;

    public car(String license, driver driver, int passenger) {
        this.id = 101010;
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    public int getId() {
        return id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public driver getDriver() {
        return driver;
    }

    public void setDriver(driver driver) {
        this.driver = driver;
    }

    public int getPassenger() {
        return this.passenger;
    }

    public void setPassenger(int passenger) {
        if (passenger != 4) {
            System.out.println("You need to assign 4 passengers");
            return;
        } else {
            this.passenger = passenger;
        }
    }

    @Override
    public String toString() {
        return ("License: " + license + ", Driver: " + driver.name + ", Passenger: " + passenger);
    }
}
