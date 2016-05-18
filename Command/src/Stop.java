/**
 * Created by michaelb on 18.05.2016.
 */
public class Stop implements Command {
    private Computer computer;
    Stop(Computer computer) {
        this.computer = computer;
    }
    
    @Override
    public void  execute() {
        computer.stop();
    }
}
