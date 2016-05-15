public class SubaruBuilder extends CarBuilder {

    @Override
    void buildModel() {
        car.setModel("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(180);
    }
}