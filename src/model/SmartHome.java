package model;

import model.devices.Device;

public class SmartHome {
    private String name;
    private String address;
    private Room[] rooms;

    public SmartHome(String address,  Room[] rooms,  String name) {
        this.address = address;
        this.rooms = rooms;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String listEverything() {
        if (rooms == null || rooms.length == 0) {
            return "the house isnt built yet";
        }
        String result = "Devices in " + name + ": ";
        for (int index = 0; index < rooms.length; index++) {
            Device[] devices = rooms[index].getDevice();
            if (devices != null && devices.length > 0) {
                for (int j = 0; j < devices.length; j++) {
                    result += devices[j].getName();
                    if (index != rooms.length - 1 || j != devices.length - 1) {
                        result += ", ";
                    }
                }
            }
        }
        return result;
    }
}
