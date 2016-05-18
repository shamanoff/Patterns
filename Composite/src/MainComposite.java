/**
 * Created by michaelb on 18.05.2016.
 */
public class MainComposite {
    public static void main(String[] args) {

        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangle = new Triangle();

        Shape square3 = new Square();
        Shape circle = new Circle();
        Shape circle2 = new Circle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(square1);
        composite1.addComponent(square2);
        composite1.addComponent(triangle);

        composite2.addComponent(square3);
        composite2.addComponent(circle);
        composite2.addComponent(circle2);
        composite2.addComponent(circle);

        composite.addComponent(composite1);
        composite.addComponent(composite2);
        composite.addComponent(new Triangle());

        composite.draw();
        System.out.println("----------");
    }
}
