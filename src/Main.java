public class Main {

    public static void main(String[] args) {

        Car car = CarFactory.createCar(EngineType.HYBRID);

        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();

        System.out.println("Change Engine");

        CarFactory.installEngine(car, EngineType.GAS);

        car.accelerate();
        car.stop();
    }
}