import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

public class Airport {

    private List<? extends Plane> planes;

    //Constructor
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    Map<Integer, PassengerPlane> passengerPlanes = new TreeMap<>();

    public List<PassengerPlane> getPassengerPlanesByModel(String model) {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();

        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i) instanceof PassengerPlane) {
                if (((PassengerPlane) planes.get(i)).getModel().equals(model)) {
                    passengerPlanes.add((PassengerPlane) planes.get(i) );
                }
                if (!this.passengerPlanes.containsKey(((PassengerPlane) planes.get(i)).hashCode())) {
                    this.passengerPlanes.put(((PassengerPlane) planes.get(i)).hashCode(), (PassengerPlane) planes.get(i) );
                }
            }
        }
        return passengerPlanes;
    }

    public PassengerPlane getPlane(int hashCode) {
        return this.passengerPlanes.get(hashCode);
    }

}
