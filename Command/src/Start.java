/**
 * Created by michaelb on 18.05.2016.
 */
public class Start implements Command {
    private Computer computer;
    Start(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void  execute() {
        computer.start();
    }
}
