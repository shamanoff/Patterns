/**
 * Created by Michael on 06/05/2016.
 */
public class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Toyota Drive hard");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Stop slowly");
    }
}
