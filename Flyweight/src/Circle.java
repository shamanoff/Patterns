public class Circle implements Shape {
    int r =5;

    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+","+y+" Рисуем круг с радиусом "+r+")");
    }
}
