package behavior.observer.publisher2subscriber;

import java.time.LocalDateTime;

public class Message {
    private final String title;
    private final String content;
    private final LocalDateTime publishAt;
    private Channel publisher;

    public Message(String title, String content) {
        this.title = title;
        this.content = content;
        this.publishAt = LocalDateTime.now();
    }

    public void setPublisher(Channel publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishAt=" + publishAt +
                ", publisher=" + publisher +
                '}';
    }
}
