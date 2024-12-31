package org.example;

import java.util.ArrayList;
import java.util.List;

public class DeviceManager {

    private List<AbstractDevice> devices;
    private UserGUI userGui;

    public DeviceManager(UserGUI userGui) {
        this.userGui = userGui;
        this.devices = new ArrayList<>();
        devices.add(new Xerox(1));
        devices.add(new Canon(2));
        devices.add(new Minolta(3));
        devices.forEach(AbstractDevice::initDevice);
        checkNeedMaintenance();
    }


    public void startPrint(UserGUI.Document document) {

    }

    public UserGUI.Document startScan() {
        return new UserGUI.Document();
    }

    public void initDevices() {
        for (AbstractDevice device : devices) {
            device.initDevice();
        }
    }

    public void checkNeedMaintenance() {
        devices.stream()
                .filter(d -> (d.state.equals(DeviceState.NEEDS_MAINTENANCE) || d.state.equals(DeviceState.OUT_OF_SERVICE)))
                .forEach(d -> userGui.printErrorMessage("Device #" + d.id + "  - needs maintenance."));

    }
}
