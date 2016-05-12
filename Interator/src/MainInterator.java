public class MainInterator {
    public static void main(String[] args) {
        ConcreteAgg c = new ConcreteAgg();
        Interator it = c.getInterator();

        while (it.hasNext()) {
            System.out.println((String)it.next());
        }

    }
}
