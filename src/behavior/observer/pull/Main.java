package behavior.observer.pull;

import behavior.observer.News;
import behavior.observer.pull.observable.LatestNewsPublisher;
import behavior.observer.pull.observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        LatestNewsPublisher latestNewsPublisher = new LatestNewsPublisher();

        Subscriber alan = new Subscriber("Alan", latestNewsPublisher);
        Subscriber bess = new Subscriber("Bess", latestNewsPublisher);
        Subscriber cathy = new Subscriber("Cathy", latestNewsPublisher);

        latestNewsPublisher.addSubscriber(alan);
        latestNewsPublisher.addSubscriber(bess);
        latestNewsPublisher.addSubscriber(cathy);

        latestNewsPublisher.setLatestNews(new News("Hello World", "Hello every one"));

        latestNewsPublisher.removeSubscriber(cathy);
        latestNewsPublisher.setLatestNews(new News("Hello World2", "Hello every one2"));
    }
}
