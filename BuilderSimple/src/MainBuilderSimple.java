public class MainBuilderSimple {
    public static void main(String[] args) {
        Car car = new  CarBuilder()
                .buildModel("Volvo")
                .buildTransmission(Transmission.AUTO)
                .buildSpeed(280)
                .build();
        System.out.println(car);
    }
}
