public class Car {

    private Engine engine;
    private int speed = 0;

    public void setEngine(Engine engine) {
        this.engine = engine;
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