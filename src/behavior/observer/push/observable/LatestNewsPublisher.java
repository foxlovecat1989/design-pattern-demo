package behavior.observer.push.observable;

import behavior.observer.News;

public class LatestNewsPublisher extends Publisher {
    // subject state
    private News latestNews;

    public void setLatestNews(News latestNews) {
        this.latestNews = latestNews;
        notifyAllSubscribers(latestNews);
    }
}
