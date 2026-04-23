public class Main {

    public static void main(String[] args) {

        Car car = CarFactory.createCar(EngineType.HYBRID);

        car.start();
        car.accelerate(); // 20 → electric
        car.accelerate(); // 40 → electric
        car.accelerate(); // 60 → switch to gas
        car.brake();      // 40 → switch to electric

        System.out.println("Change Engine");

        CarFactory.installEngine(car, EngineType.GAS);

        car.accelerate();
        car.stop();
    }
}