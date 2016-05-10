package observerPattern;

/**
 * Created by Michael on 10/05/2016.
 */
public class SubscriberTwo implements PublisherActionListener {
    @Override
    public void doAction(String message) {
    System.out.println(message + " from " + this.getClass().getName());
}
}