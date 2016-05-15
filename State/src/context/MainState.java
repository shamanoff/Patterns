package context;

import state.FireState;
import state.MoveState;
import state.TransformerState;

/**
 * Created by Michael on 11/05/2016.
 */
public class MainState {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
    }


}
