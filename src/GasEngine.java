public class GasEngine implements Engine {
    private int speed = 0;

    public void start() {
        speed = 0;
        System.out.println("Gas Engine Started");
    }

    public void stop() {
        speed = 0;
        System.out.println("Gas Engine Stopped");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Gas Engine running at " + speed + " km/h");
    }
}