package model.devices;

public class SmartLights extends Device {
    private String brightness;
    private String color;
    private String model;

    public SmartLights(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String deviceInfo() {
        return super.deviceInfo() + " its model is "
                + model +" and it is " + color;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public String turnOn() {
        return "Lights are on!";
    }

    public String turnOff() {
        return "Lights are off!";
    }
}
