public class FordBuilder extends CarBuilder {

    @Override
    void buildModel() {
        car.setModel("Ford Mustang");
    }

    @Override
    void buildTransmission() {
    car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
    car.setMaxSpeed(268);
    }
}
