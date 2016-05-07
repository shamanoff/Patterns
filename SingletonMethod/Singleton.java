/**
 * Singleton Pattern
 */
public class Singleton {

    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            }return instance;
    }
//private constructor with no parametrs
    private Singleton() {
    }
//some metod
    public void print() {
        System.out.println("Hello from print metod!");
    }
}
