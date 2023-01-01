public class uberPool extends car {
    public String brand;
    public String model;

    public uberPool(String license, driver driver, int passenger, String brand, String model) {
        super(license, driver, passenger);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return (super.toString() + ", Brand: " + brand + ", Model: " + model);
    }
}
