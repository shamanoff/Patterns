/**
 * Created by michaelb on 18.05.2016.
 */
public class Invoker {
    private Command start;
    private Command stop;
    private Command reset;

    Invoker(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startComputer() {
        start.execute();
    }
    void stopComputer() {
        stop.execute();
    }
    void resetComputer() {
        reset.execute();
    }


}
