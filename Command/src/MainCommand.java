/**
 * Created by michaelb on 18.05.2016.
 */
public class MainCommand {
    public static void main(String[] args) {
        Computer c = new Computer();
        Invoker u = new Invoker(new Start(c), new Stop(c), new Reset(c));
        u.startComputer();
        u.resetComputer();
        u.stopComputer();
    }
}
