package model.devices;

public class SecurityCamera extends Device {
    private String resolution;
    private String sensor;
    private boolean recording;

    public SecurityCamera(String resolution, String sensor) {
        this.resolution = resolution;
        this.sensor = sensor;
    }

    @Override
    public String deviceInfo() {
        return super.deviceInfo() + " it has a " + resolution
                + " resolution and a " + sensor + " sensor";
    }

    public boolean isRecording() {
        return recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    public String recording() {
        if (isRecording()) {
            return "Currently being recorded";
        } else {
            return "currently not being recorded";
        }
    }
}
