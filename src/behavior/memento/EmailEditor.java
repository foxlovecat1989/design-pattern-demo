package behavior.memento;


public class EmailEditor {
    private String mailTo;
    private String subject;
    private String content;

    public void printEmail() {
        System.out.println("MailTo: " + mailTo);
        System.out.println("Subject: " + subject);
        System.out.println("Content: " + content);
    }

    public void update(String newMailTo, String newSubject, String newContent) {
        this.mailTo = newMailTo;
        this.subject = newSubject;
        this.content = newContent;
    }

    public EmailState save() {
        return new EmailState(subject, content, mailTo);
    }

    public void restore(EmailState state) {
        this.mailTo = state.getMailTo();
        this.subject = state.getSubject();
        this.content = state.getContent();
        System.out.println("### Restore state from SeqNo: " + state.getSequenceNo() + " ###");
    }
}
