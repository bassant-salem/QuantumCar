public class Main {

    public static void main(String[] args) {

        Car car = Car.createCar(EngineType.HYBRID);

        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();

        System.out.println("Change Engine");

        car.setEngine(EngineType.GAS);

        car.accelerate();
        car.stop();
    }
}
