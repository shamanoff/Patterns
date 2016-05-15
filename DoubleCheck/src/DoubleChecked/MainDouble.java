package DoubleChecked;

/**
 * Created by Michael on 12/05/2016.
 */
public class MainDouble {
    public static void main(String[] args) {
        //thread 1
        new Thread(new Runnable() {
            @Override
            public void run() {
                A a = DoubleChecked.getA("thread 1");
                String title = a.getTitle();
                System.out.println("title 1: "+title);
            }
        }).start();
        //thread 2
        new Thread(new Runnable() {
            @Override
            public void run() {
                A a = DoubleChecked.getA("thread 2");
                String title = a.getTitle();
                System.out.println("title 2: "+title);
            }
        }).start();
    }
}
