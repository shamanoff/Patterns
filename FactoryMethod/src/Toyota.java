/**
 * Created by Michael on 06/05/2016.
 */
public class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Drive hard");
    }

    @Override
    public void stop() {
        System.out.println("Stop slowly");
    }
}
