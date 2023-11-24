package behavior.observer.subscriber2publisher;

import java.time.LocalDateTime;
import java.util.*;

public class User {
    private final String username;
    private final List<Message> messages;
    private final Map<String, LocalDateTime> histories;

    public User(String username) {
        this.username = username;
        this.messages = new ArrayList<>();
        this.histories = new HashMap<>();
    }

    public void sync(Channel channel) {
        channel.syncMessages(this);
        this.histories.put(channel.getChannelName(), LocalDateTime.now());
    }

    public Optional<LocalDateTime> getLastSeen(String channelName) {
        return Optional.ofNullable(this.histories.get(channelName));
    }

    public void receiveMessages(List<Message> messages) {
        System.out.println("User: " + username);
        System.out.println("receive Messages: " + messages);
        this.messages.addAll(messages);
        System.out.println("has Messages: " + this.messages);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
