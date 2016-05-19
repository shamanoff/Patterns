public class SMSLogger implements Logger {
    int priority =1;

//    public SMSLogger(int priority) {
//        this.priority = priority;
//    }

    Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    @Override
    public void writeMessage(String message, int level) {

        if (priority==level) {
            System.out.println("SMS message: " +message);
        }
        if (next!=null){next.writeMessage(message, level);
        }
    }
}
