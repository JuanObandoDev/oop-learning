import java.util.Map;

public class uberBlack extends car {
    public Map<String, Map<String, Integer>> typeCarAccepted;
    public Map<String, Integer> seatsMaterial;

    public uberBlack(String license, driver driver, int passenger, Map<String, Map<String, Integer>> typeCarAccepted,
            Map<String, Integer> seatsMaterial) {
        super(license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public String toString() {
        return (super.toString() + ", Type Car Accepted: " + typeCarAccepted + ", Seats Material: " + seatsMaterial);
    }
}
