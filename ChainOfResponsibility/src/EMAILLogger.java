public class EMAILLogger implements Logger {
    int priority = 3;
//
//    public EMAILLogger(int priority) {
//        this.priority = priority;
//    }

    Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    @Override
    public void writeMessage(String message, int level) {

        if (priority==level) {
            System.out.println("EMAIL mail: " +message);
        }
        if (next!=null){next.writeMessage(message, level);
        }
    }
}
