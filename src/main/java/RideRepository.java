import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {
    Map<String, ArrayList<Ride>> userRides =null;

    public RideRepository() {
        this.userRides = new HashMap<>();
    }
}
