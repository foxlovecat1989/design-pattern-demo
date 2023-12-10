package behavior.observer.push.observer;

import behavior.observer.News;

public interface Subscriber {
    void update(News news);
}
