public class MainChain {
    public static void main(String[] args) {
        SMSLogger logger0 = new SMSLogger();
        FILELogger logger1 = new FILELogger();
        EMAILLogger logger2 = new EMAILLogger();

        logger0.setNext(logger1);
        logger1.setNext(logger2);




        logger0.writeMessage("Любое сообщение в любой путь ",1);
        logger0.writeMessage("Любое сообщение в любой ", 3);
        logger0.writeMessage("Любое сообщение  ", 2);

    }
}
