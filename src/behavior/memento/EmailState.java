package behavior.memento;

import java.util.UUID;

public class EmailState {
    private final String sequenceNo;
    private final String subject;
    private final String content;
    private final String mailTo;

    public EmailState(String subject, String content, String mailTo) {
        this.sequenceNo = UUID.randomUUID().toString().substring(0, 5);
        this.subject = subject;
        this.content = content;
        this.mailTo = mailTo;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getMailTo() {
        return mailTo;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }
}
