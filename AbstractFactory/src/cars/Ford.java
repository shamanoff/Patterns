package cars;

import trans.faces.Car;

/**
 * Created by Michael on 06/05/2016.
 */
public class Ford implements Car {
    @Override
    public void drive() {
        System.out.println("i'am Ford!");
    }
}
