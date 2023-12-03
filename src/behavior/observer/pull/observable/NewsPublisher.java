package behavior.observer.pull.observable;

import behavior.observer.pull.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyAllSubscribers() {
        subscribers.forEach(Subscriber::update);
    }
}
