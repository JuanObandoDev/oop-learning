public class uberX extends car {
    public String brand;
    public String model;

    public uberX(String license, driver driver, int passenger, String brand, String model) {
        super(license, driver, passenger);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return ("License: " + license + ", Driver: " + driver.name + ", Passenger: " + passenger + ", Brand: " + brand
                + ", Model: " + model);
    }
}
