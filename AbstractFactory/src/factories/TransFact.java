package factories;

import trans.faces.Aircraft;
import trans.faces.Car;

/**
 * Created by Michael on 07/05/2016.
 */
public interface TransFact {

    public Car createCar();
    public Aircraft createAircraft();
}
