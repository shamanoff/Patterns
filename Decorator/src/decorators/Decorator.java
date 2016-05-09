package decorators;

import objects.Component;

/**
 * Created by michaelb on 09.05.2016.
 */
public abstract class Decorator implements Component{
    protected Component component;
//constructor
    public Decorator(Component component) {
        this.component = component;
    }
//new method
    public abstract void afterDraw();

    @Override
    public void draw() {
        //call method
        component.draw();
        //call new method
        afterDraw();
    }
}
