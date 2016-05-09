package decorators;

import objects.Component;
import objects.TextView;
import objects.Window;

/**
 * Created by michaelb on 09.05.2016.
 */
public class DecoratorMain {
    public static void main(String[] args) {

        Component windowWithBorder = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithBorder.draw();

//        Component windowWithBorder = new BorderDecorator(new Window());
//        windowWithBorder.draw();

//        Component window = new Window();
//        window.draw();


        Component textView = new ColorDecorator(new TextView());
        textView.draw();
    }
}
