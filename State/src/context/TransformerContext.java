package context;

import state.TransformerState;

/**
 * Created by Michael on 11/05/2016.
 */
public class TransformerContext implements TransformerState {

    private TransformerState state;

    public TransformerState getState() {
        return state;
    }

    public void setState(TransformerState state) {
        this.state = state;
    }

    @Override
    public void action() {
        this.state.action();

    }
}
