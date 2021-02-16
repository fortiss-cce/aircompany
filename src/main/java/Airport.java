import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.Plane;

import java.util.*;

public class Airport {

    /**
     * Prints transport military planes
     */
    private void printMaxTransportMilitaryPlane() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        Plane maxPlane = null;

        // print banner
        System.out.println ("*********************************************");
        System.out.println ("***** Largest Transport Military Plane ******");
        System.out.println ("*********************************************");

        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                if (((MilitaryPlane) plane).getType() == MilitaryType.TRANSPORT) {
                    if (maxPlane != null && maxPlane.getMaxLoadCapacity() < plane.getMaxLoadCapacity()) {
                        maxPlane = plane;
                    }
                }
            } //if
            else {

            } // else
        } //for
        System.out.println("model:" + maxPlane.getModel());
        System.out.println("capacity:" + maxPlane.getMaxLoadCapacity());
    }

    //Constructor
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
        this.printMaxTransportMilitaryPlane();
    }

    private List<? extends Plane> planes;

    public List<? extends Plane> getPlanes() {
        return planes;
    }

}
