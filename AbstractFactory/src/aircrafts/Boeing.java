package aircrafts;

import trans.faces.Aircraft;

/**
 * Created by Michael on 06/05/2016.
 */
public class Boeing implements Aircraft {
    @Override
    public void flight() {
        System.out.println("i'am Boeing!");
    }
}
