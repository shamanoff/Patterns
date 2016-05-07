/**
 * Created by Michael on 06/05/2016.
 */
public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
