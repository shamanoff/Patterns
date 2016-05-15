package state;

/**
 * Created by Michael on 11/05/2016.
 */
public class FireState implements TransformerState{
    @Override
    public void action() {
        System.out.println("fire");
    }
}
