package behavior.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EmailState> states;

    public History() {
        this.states = new ArrayList<>();
    }

    public void push(EmailState state) {
        states.add(state);
    }

    public EmailState pop() {
        int index = states.size() - 1;
        EmailState latestStates = states.get(index);
        states.remove(latestStates);

        return latestStates;
    }
}
