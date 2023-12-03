package behavior.observer.pull.observable;

import behavior.observer.News;
import behavior.observer.pull.observer.Subscriber;


import java.util.ArrayList;
import java.util.List;

public class LatestNewsPublisher implements Observable {
    private News latestNews;
    private final List<Subscriber> subscribers;

    public LatestNewsPublisher() {
        this.subscribers = new ArrayList<>();
    }

    public News getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(News latestNews) {
        this.latestNews = latestNews;
        notifyAllSubscribers();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscribers() {
        subscribers.forEach(Subscriber::update);
    }
}
