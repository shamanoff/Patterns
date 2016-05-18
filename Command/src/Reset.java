/**
 * Created by michaelb on 18.05.2016.
 */
public class Reset implements Command{
    private Computer computer;
    Reset(Computer computer) {
        this.computer = computer;
    }
    
    @Override
    public void  execute() {
        computer.reset();
    }
}
