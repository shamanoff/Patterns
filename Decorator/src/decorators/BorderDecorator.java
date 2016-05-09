package decorators;

import objects.Component;

/**
 * Created by michaelb on 09.05.2016.
 */
public class BorderDecorator extends Decorator {
    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("add border");
    }

}
