/**
 * Factory Method
 */
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = carFactory.getCar(RoadType.OFF_ROAD);
        car.drive();
        car.stop();

        car = carFactory.getCar(RoadType.MOUNT);
        car.drive();
        car.stop();
    }
}
