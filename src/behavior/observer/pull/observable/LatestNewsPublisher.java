package behavior.observer.pull.observable;

import behavior.observer.News;

public class LatestNewsPublisher extends Publisher {
    private News latestNews;

    public News getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(News latestNews) {
        this.latestNews = latestNews;
        notifyAllSubscribers();
    }
}
