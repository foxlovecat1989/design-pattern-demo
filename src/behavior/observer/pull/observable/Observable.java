package behavior.observer.pull.observable;

import behavior.observer.pull.observer.Subscriber;

// Subject
public interface Observable {
    // attach
    void addSubscriber(Subscriber subscriber);
    // detach
    void removeSubscriber(Subscriber subscriber);
    // notify
    void notifyAllSubscribers();
}
