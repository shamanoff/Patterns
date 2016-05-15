public class MainBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new FordBuilder());
        Car car = director.BuildCar();
        System.out.println(car);
    }
}
