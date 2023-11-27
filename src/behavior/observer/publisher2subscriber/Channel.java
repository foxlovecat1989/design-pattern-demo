package behavior.observer.publisher2subscriber;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private final String channelName;
    private final List<User> subscribers;

    public Channel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    public void add(User user) {
        this.subscribers.add(user);
    }

    public void remove(User user) {
        this.subscribers.remove(user);
    }

    public void publishAll(Message message) {
        message.setPublisher(this);
        subscribers.forEach(subscriber -> subscriber.receiveMessage(message));
    }

    @Override
    public String toString() {
        return "Channel{" +
                "channelName='" + channelName + '\'' +
                ", subscribers=" + subscribers +
                '}';
    }
}
