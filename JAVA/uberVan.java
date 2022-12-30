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
}
