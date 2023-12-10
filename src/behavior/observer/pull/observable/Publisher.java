package behavior.observer.pull.observable;

import behavior.observer.pull.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

// Subject
public abstract class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();

    // attach
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // detach
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // notify
    public void notifyAllSubscribers() {
        subscribers.forEach(Subscriber::update);
    }
}
