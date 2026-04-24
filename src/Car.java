public class Car {

    private Engine engine;
    private int speed = 0;

    public static Car createCar(EngineType type) {
        Car car = new Car();

        switch (type) {
            case GAS:
                car.engine = new GasEngine();
                break;
            case ELECTRIC:
                car.engine = new ElectricEngine();
                break;
            case HYBRID:
                car.engine = new HybridEngine();
                break;
            default:
                throw new IllegalArgumentException("Invalid type");
        }

        return car;
    }


    public void setEngine(EngineType type) {
        switch (type) {
            case GAS:
                this.engine = new GasEngine();
                break;
            case ELECTRIC:
                this.engine = new ElectricEngine();
                break;
            case HYBRID:
                this.engine = new HybridEngine();
                break;
        }
    }

    public void start() {
        speed = 0;
        engine.start();
    }

    public void stop() {
        speed = 0;
        engine.stop();
    }

    public void accelerate() {
        if (speed < 200) {
            speed += 20;
            engine.setSpeed(speed);
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 20;
            engine.setSpeed(speed);
        }
    }
}