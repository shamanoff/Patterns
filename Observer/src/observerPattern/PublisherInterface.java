package observerPattern;

import java.util.ArrayList;

/**
 * Created by Michael on 10/05/2016.
 */
public interface PublisherInterface {
    ArrayList<PublisherActionListener> getListeners();

    void addListener(PublisherActionListener listener);

    public void removeListener(PublisherActionListener listener);

    public void removeAllListeners();

    public void notifySubscribers(String message);

}
