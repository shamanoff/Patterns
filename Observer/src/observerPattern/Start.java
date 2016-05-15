package observerPattern;

/**
 * Created by Michael on 10/05/2016.
 */
public class Start {
    public static void main(String[] args) {

        SubscriberOne subscriberOne = new SubscriberOne();
        SubscriberTwo subscriberTwo = new SubscriberTwo();

        Publisher publisher = new Publisher();

        publisher.addListener(subscriberOne);
        publisher.addListener(subscriberTwo);

        publisher.createNewMessage("Message!");
    }
}
