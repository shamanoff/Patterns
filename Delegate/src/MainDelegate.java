public class MainDelegate {
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setGraphics(new Sguare());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();

        painter.setGraphics(new Circle());
        painter.draw();

        painter.setGraphics(new Sguare());
        painter.draw();
    }
}
