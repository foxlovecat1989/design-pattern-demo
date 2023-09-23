package behavior.memento;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        Scenario:
//        The client creates the email and then edits it, clicking the save button when finished.
//        (When the save button is clicked,  EmailEditor creates a state, and then history pushes it to memory. )
//        The client edits the email and saves it three times.
//        After that, the client wants to restore to the first edition of the email,
//        so he clicks the restore button two times.
//        (When restoring, History pops the previous state of the email, and then EmailEditor restores it.)
        EmailEditor editor = new EmailEditor();
        History history = new History();
        Client client = new Client(editor, history);

        // Edit the email - first edition
        client.editEmail("john_staff@gmail.com",
                "Important Meeting",
                "Dear John, please join the meeting at 3 PM.");
        System.out.println("First Edition: ");
        editor.printEmail();
        client.clickSave();

        // Edit the email - second edition
        client.editEmail("john_staff@gmail.com",
                "Updated Meeting Info",
                "Dear John, the meeting is rescheduled to 4 PM.");
        System.out.println("\nSecond Edition: ");
        editor.printEmail();
        client.clickSave();

        // Edit the email - third edition
        editor.update("john_staff@gmail.com",
                "Updated Meeting Info",
                "Dear John, the meeting is rescheduled to 5 PM.");
        System.out.println("\nThird Edition:");
        editor.printEmail();

        // Restore to the first edition - undo two times
        IntStream.rangeClosed(1, 2).forEach(i -> {
            client.clickUndo();
        });

        System.out.println("\nCurrent Content: ");
        editor.printEmail();
    }
}
