/**
 * Factory method
 */
public class CarFactory {
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case MOUNT:
                car = new Toyota();
                break;
        }
        return car;
    }

}