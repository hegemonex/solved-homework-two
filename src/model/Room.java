package model;

import model.devices.Device;

public class Room {
    private String room;
    private int floor;
    private Device[] device;

    public Room(int floor, Device[] device,  String room) {
        this.floor = floor;
        this.device = device;
        this.room = room;
    }

    public Device[] getDevice() {
        return device;
    }

    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }

    public String listDevices(){
        if(device==null || device.length==0){
            return "there are no devices";
        }
        String result = "Devices in " + room + ": ";
        for (int i = 0; i < device.length; i++) {
            result += device[i].getName();
            if (i != device.length - 1) result += ", ";
        }
        return result;
    }
}
