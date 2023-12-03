package behavior.observer.push.observable;

import behavior.observer.News;
import behavior.observer.push.observer.Subscriber;

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

    public void notifyAllSubscribers(News news) {
        subscribers.forEach(subscriber -> subscriber.update(news));
    }
}
