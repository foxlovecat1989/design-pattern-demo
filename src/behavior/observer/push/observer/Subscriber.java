package behavior.observer.push.observer;

import behavior.observer.News;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer{
    private final String name;
    private final List<News> news;

    public Subscriber(String name) {
        this.name = name;
        this.news = new ArrayList<>();
    }

    @Override
    public void update(News news) {
        this.news.add(news);
        System.out.printf("%s received news: %s%n", name, news);
    }
}
