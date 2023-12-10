package behavior.observer.push.observable;

import behavior.observer.News;
import behavior.observer.push.observer.LatestNewsSubscriber;

import java.util.ArrayList;
import java.util.List;

// Subject
public abstract class Publisher {
    List<LatestNewsSubscriber> latestNewsSubscribers = new ArrayList<>();

    // attach
    public void addSubscriber(LatestNewsSubscriber latestNewsSubscriber) {
        latestNewsSubscribers.add(latestNewsSubscriber);
    }

    // detach
    public void removeSubscriber(LatestNewsSubscriber latestNewsSubscriber) {
        latestNewsSubscribers.remove(latestNewsSubscriber);
    }

    // notify
    public void notifyAllSubscribers(News news) {
        latestNewsSubscribers.forEach(latestNewsSubscriber -> latestNewsSubscriber.update(news));
    }
}
