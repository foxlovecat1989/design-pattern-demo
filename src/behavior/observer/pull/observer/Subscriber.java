package behavior.observer.pull.observer;

import behavior.observer.News;
import behavior.observer.pull.observable.LatestNewsPublisher;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
    private final String name;
    private final List<News> news;
    private final LatestNewsPublisher latestNewsPublisher;

    public Subscriber(String name, LatestNewsPublisher latestNewsPublisher) {
        this.name = name;
        this.latestNewsPublisher = latestNewsPublisher;
        this.news = new ArrayList<>();
    }

    @Override
    public void update() {
        News latestNews = latestNewsPublisher.getLatestNews();
        this.news.add(latestNews);
        System.out.printf("%s get news: %s%n", name, latestNews);
    }
}
