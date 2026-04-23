public class ElectricEngine implements Engine {
    private int speed = 0;

    public void start() {
        speed = 0;
        System.out.println("Electric Engine Started");
    }

    public void stop() {
        speed = 0;
        System.out.println("Electric Engine Stopped");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Electric Engine running at " + speed + " km/h");
    }
}