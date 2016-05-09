import factories.RusFactory;
import factories.TransFact;
import factories.UsaFactory;

/**
 * Created by Michael on 06/05/2016.
 */
public class Main {

    private static TransFact fact;
    public static void main(String[] args) {
        if (true) {
            fact = new RusFactory();
        } else {
            fact = new UsaFactory();
        }
        fact.createAircraft();
        fact.createCar();
        //realization version

//        TransFact rusFactory = new RusFactory();
//        Aircraft aircraft = rusFactory.createAircraft();
//        aircraft.flight();

    


    }
}
