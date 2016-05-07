package factories;

import aircrafts.Boeing;
import cars.Ford;
import trans.faces.Aircraft;
import trans.faces.Car;

/**
 * Created by Michael on 06/05/2016.
 */
public class UsaFactory implements TransFact{
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing();
    }
}
