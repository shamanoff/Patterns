import static java.lang.System.out;

public class CarBuilder {
    String m = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilder buildModel(String m) {
        this.m = m;
        return this;
    }
    CarBuilder buildTransmission(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder buildSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setModel(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;

    }

}
