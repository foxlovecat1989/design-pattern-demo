package behavior.observer.subscriber2publisher;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Channel {
    private final String channelName;
    private final List<Message> messages;

    public Channel(String channelName) {
        this.channelName = channelName;
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        message.setPublisher(this);
        message.setPublishAt(LocalDateTime.now());
        this.messages.add(message);
    }

    public void syncMessages(User user) {
        List<Message> newMessages = this.messages.stream()
                .filter(message -> {
                    boolean hasNeverSeen = user.getLastSeen(this.getChannelName()).isEmpty();
                    if (hasNeverSeen) {
                        return true;
                    }

                    return message.getPublishAt().getNano() > user.getLastSeen(this.getChannelName()).get().getNano();
                })
                .collect(Collectors.toList());
        user.receiveMessages(newMessages);
    }

    public String getChannelName() {
        return channelName;
    }

    public List<Message> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "channelName='" + channelName + '\'' +
                '}';
    }
}
