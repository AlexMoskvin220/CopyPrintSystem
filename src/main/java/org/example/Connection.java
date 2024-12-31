package org.example;

public class Connection implements Sequrity {

    private String IP;
    private DeviceManager deviceManager;

    public Connection(String IP, DeviceManager deviceManager) {
        this.IP = IP;
        this.deviceManager = deviceManager;
    }

    @Override
    public boolean checkUser() {
        // Implementation to check user
        return true;
    }

    public DeviceManager startUserSession(UserGUI.User user) {

        if(checkUser()) return deviceManager;
        return null;
    }
}
