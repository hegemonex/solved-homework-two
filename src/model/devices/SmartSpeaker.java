package model.devices;

public class SmartSpeaker extends Device {
    private Double volume;
    private String assistantName;

    public SmartSpeaker(String assistantName) {
        this.assistantName = assistantName;
    }

    @Override
    public String deviceInfo() {
        return super.deviceInfo() + " its assistant name is " + assistantName;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String turnUpVol() {
        volume++;
        return "the volume was turned up, it is now " + volume;
    }

    public String turnDownVol() {
        volume--;
        return "the volume was turned down, it is now " + volume;
    }
}
