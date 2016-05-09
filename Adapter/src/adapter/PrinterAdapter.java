package adapter;

import objects.Printer;

import java.util.List;

/**
 * Created by michaelb on 09.05.2016.
 */
public class PrinterAdapter implements PageListPrinter{

    private Printer printer = new Printer();
    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);
        }
    }
}
