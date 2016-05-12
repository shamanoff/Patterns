package DoubleChecked;

/**
 * Created by Michael on 12/05/2016.
 */
public class DoubleChecked {
    private volatile static A a;

    public static A getA(String title) {
        if (a == null) {
            synchronized (A.class) {
                if (a == null) {
                    a = new A(title);
                }
            }
        }return a;
    }


}
