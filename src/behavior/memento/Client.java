package behavior.memento;

public class Client {
    private final EmailEditor editor;
    private final History history;

    public Client(EmailEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    public void editEmail(String mailTo, String subject, String content) {;
        editor.update(mailTo, subject, content);
    }

    public void clickSave() {
        System.out.println("### Client click the save button ###");
        EmailState state = editor.save();
        history.push(state);
    }

    public void clickUndo() {
        System.out.println("\n### Client click the undo button ###");
        EmailState state = history.pop();
        editor.restore(state);
    }
}
