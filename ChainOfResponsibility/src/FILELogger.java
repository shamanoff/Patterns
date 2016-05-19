public class FILELogger implements Logger {
    int priority = 2;

    //public FILELogger(int priority) {
     //   this.priority = priority;
    //}

    Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    @Override
    public void writeMessage(String message, int level) {

        if (priority ==level) {
            System.out.println("FILE text: " +message);
        }
        if (next!=null){next.writeMessage(message, level);
        }
    }
}
