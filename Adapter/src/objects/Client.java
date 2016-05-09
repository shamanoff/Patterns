package objects;

import adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelb on 09.05.2016.
 */
public class Client {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);

    }
}
