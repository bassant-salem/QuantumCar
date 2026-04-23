public class HybridEngine implements Engine {

    private GasEngine gasEngine = new GasEngine();
    private ElectricEngine electricEngine = new ElectricEngine();

    private Engine operatingEngine;
    private int speed = 0;

    public void start() {
        operatingEngine = electricEngine;
        operatingEngine.start();
    }

    public void setSpeed(int speed) {


        if (speed > 50 && this.speed <= 50) {
            gasEngine.start();
            electricEngine.stop();
            operatingEngine = gasEngine;
        }


        else if (speed <= 50 && this.speed > 50) {
            electricEngine.start();
            gasEngine.stop();
            operatingEngine = electricEngine;
        }

        this.speed = speed;
        operatingEngine.setSpeed(speed);
    }

    public void stop() {
        operatingEngine.stop();
    }
}