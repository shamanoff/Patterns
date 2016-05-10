package objects.parts;

import facade.CarFacade;

/**
 * Created by Michael on 09/05/2016.
 */
public class Client {

    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.go();

    }

}
