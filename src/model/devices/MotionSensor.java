package model.devices;

public class MotionSensor extends Device {
    private int sensetivity;
    private boolean motionDetected;

    public MotionSensor(int sensetivity) {
        this.sensetivity = sensetivity;
    }

    @Override
    public String deviceInfo() {
        return super.deviceInfo() + " its sensetivity is " + sensetivity;
    }

    public boolean isMotionDetected() {
        return motionDetected;
    }

    public void setMotionDetected(boolean motionDetected) {
        this.motionDetected = motionDetected;
    }

    public String detectMotion() {
        if (motionDetected) {
            return "Motion detected! Alert!";
        } else {
            return "No motion detected.";
        }
    }
}
