package behavior.observer.push.observable;

import behavior.observer.News;
import behavior.observer.push.observer.Subscriber;

// Subject
public interface Observable {
    // attach
    void addSubscriber(Subscriber subscriber);
    // detach
    void removeSubscriber(Subscriber subscriber);
    // notify
    void notifyAllSubscribers(News news);
}
