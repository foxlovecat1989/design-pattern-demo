package behavior.observer.push;

import behavior.observer.News;
import behavior.observer.push.observable.LatestNewsPublisher;
import behavior.observer.push.observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        Subscriber alan = new Subscriber("Alan");
        Subscriber bess = new Subscriber("Bess");
        Subscriber cathy = new Subscriber("Cathy");

        LatestNewsPublisher latestNewsPublisher = new LatestNewsPublisher();
        latestNewsPublisher.addSubscriber(alan);
        latestNewsPublisher.addSubscriber(bess);
        latestNewsPublisher.addSubscriber(cathy);

        latestNewsPublisher.setLatestNews(new News("Hello World", "Hello every one"));

        latestNewsPublisher.removeSubscriber(cathy);
        latestNewsPublisher.setLatestNews(new News("Hello World2", "Hello every one2"));
    }
}
