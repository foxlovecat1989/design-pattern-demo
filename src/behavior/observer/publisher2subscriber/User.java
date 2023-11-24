package behavior.observer.publisher2subscriber;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private final List<Message> messages;

    public User(String username) {
        this.username = username;
        this.messages = new ArrayList<>();
    }

    public void subscribe(Channel channel) {
        channel.add(this);
    }

    public void receiveMessage(Message message) {
        System.out.println("User: " + username);
        System.out.println("receive Message: " + message);
        this.messages.add(message);
        System.out.println("has Messages: " + this.messages);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
