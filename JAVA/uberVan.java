import java.util.Map;

public class uberVan extends car {
    public Map<String, Map<String, Integer>> typeCarAccepted;
    public Map<String, Integer> seatsMaterial;

    public uberVan(String license, driver driver, int passenger, Map<String, Map<String, Integer>> typeCarAccepted,
            Map<String, Integer> seatsMaterial) {
        super(license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(int passenger) {
        if (passenger != 6) {
            System.out.println("You need to assign 6 passengers");
            return;
        } else {
            this.passenger = passenger;
        }
    }

    @Override
    public String toString() {
        return (super.toString() + ", Type Car Accepted: " + typeCarAccepted
                + ", Seats Material: " + seatsMaterial);
    }
}
