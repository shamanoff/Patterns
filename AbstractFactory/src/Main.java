import factories.RusFactory;
import factories.TransFact;
import factories.UsaFactory;
import trans.faces.Aircraft;
import trans.faces.Car;

/**
 * Created by Michael on 06/05/2016.
 */
public class Main {
//  private static TransFact fact;
    public static void main(String[] args) {
//        if (true) {
//            fact = new RusFactory();
//        } else {
//            fact = new UsaFactory();
//        }
//        fact.createAircraft();
//        fact.createCar();
        //realization version
        TransFact rusFactory = new RusFactory();
        TransFact usaFactory = new UsaFactory();
        Aircraft aircraft = rusFactory.createAircraft();
        Aircraft aircraft1 = usaFactory.createAircraft();
        Car car = rusFactory.createCar();
        Car car1 = usaFactory.createCar();

        car1.drive();

        car.drive();

        aircraft1.flight();

        aircraft.flight();



    


    }
}
