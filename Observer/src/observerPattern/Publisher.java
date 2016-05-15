package observerPattern;

import java.util.ArrayList;

/**
 * Created by Michael on 10/05/2016.
 */
public class Publisher implements PublisherInterface {

    private ArrayList<PublisherActionListener> listners = new ArrayList<>();
    @Override
    public ArrayList<PublisherActionListener> getListeners() {
        return listners;
    }

    @Override
    public void addListener(PublisherActionListener listener) {
        listners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        listners.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        listners.clear();

    }

    @Override
    public void notifySubscribers(String message) {
        for (PublisherActionListener actionListner : listners) {
            actionListner.doAction(message);

        }

    }

    public void createNewMessage(String message) {
        System.out.println("Publisher printed message " + message);
        notifySubscribers(message);

    }

}
