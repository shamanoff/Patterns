package facade;

import parts.Doors;
import parts.Ignition;
import parts.Wheel;

/**
 * Created by Michael on 09/05/2016.
 */
public class CarFacade {
    Doors doors = new Doors();
    Ignition ignition = new Ignition();
    Wheel wheel = new Wheel();

    public void go() {
        doors.open();
        ignition.start();
        wheel.spin();
    }
}
