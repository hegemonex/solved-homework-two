package model.devices;

public class Thermostat extends Device {
    private Double currentTemp;
    private Double targetTemp;

    public Thermostat(Double currentTemp) {
        this.currentTemp = currentTemp;
    }

    public Double getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(Double targetTemp) {
        this.targetTemp = targetTemp;
    }

    public String setTheTemp(){
        return "The starting temperature is - "
                + currentTemp.toString() + " the desired temperature is - "
                + targetTemp.toString();
    }
}
