package model.devices;

public class SmartPlug extends Device {
    private String connectedDevice;
    private Double powerConsumption;

    public SmartPlug(Double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getConnectedDevice() {
        return connectedDevice;
    }

    public void setConnectedDevice(String connectedDevice) {
        this.connectedDevice = connectedDevice;
    }

    public String turnOn() {
        return connectedDevice + " is now ON.";
    }

    public String turnOff() {
        return connectedDevice + " is now OFF.";
    }

    public String showPowerUsage() {
        return connectedDevice + " is using " + powerConsumption + "W";
    }
}
