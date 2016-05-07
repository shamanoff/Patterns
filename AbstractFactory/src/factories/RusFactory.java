package factories;


import aircrafts.TU;
import cars.Volga;
import trans.faces.Aircraft;
import trans.faces.Car;

/**
 * Created by Michael on 06/05/2016.
 */
public class RusFactory implements TransFact {


    @Override
    public Car createCar() {
        return new Volga();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU();
    }
}
