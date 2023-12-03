package behavior.observer.push.observable;

import behavior.observer.News;
import behavior.observer.push.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class LatestNewsPublisher implements Observable {
    private final List<Subscriber> subscribers;
    // subject state
    private News latestNews;

    public LatestNewsPublisher() {
        this.subscribers = new ArrayList<>();
    }

    // attach
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // detach
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // notify
    public void notifyAllSubscribers(News news) {
        subscribers.forEach(subscriber -> subscriber.update(news));
    }

    public void setLatestNews(News latestNews) {
        this.latestNews = latestNews;
        notifyAllSubscribers(latestNews);
    }
}
