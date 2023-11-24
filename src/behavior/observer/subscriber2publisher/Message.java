package behavior.observer.subscriber2publisher;

import java.time.LocalDateTime;

public class Message {
    private final String title;
    private final String content;
    private LocalDateTime publishAt;
    private Channel publisher;

    public Message(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public LocalDateTime getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(LocalDateTime publishAt) {
        this.publishAt = publishAt;
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
