package behavior.observer;

import java.time.LocalDateTime;

public class News {
    private final String title;
    private final String content;
    private final LocalDateTime publishAt;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
        this.publishAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishAt=" + publishAt +
                '}';
    }
}
