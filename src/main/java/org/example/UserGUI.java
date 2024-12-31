package org.example;

import java.util.Random;

public class UserGUI {

    private Connection connection;
    private User user;
    private DeviceManager deviceManager;

    public UserGUI() {
        this.user = new User(new Random().nextInt(101));
        this.connection = new Connection("123.44.555.66",new DeviceManager(this));
        this.deviceManager = connection.startUserSession(user);
    }

    public void printTask(Document document) {
        deviceManager.startPrint(document);
    }

    public Document scanTask() {
        return deviceManager.startScan();
    }

    public void printErrorMessage(String message) {
        // Implementation to handle error message

        System.out.println(message);
    }




    class User {

        private int id;


        public User(int id){
            this.id = id;
        }

    }

    static class Document {

        private String data;

        public Document(){

            this.data = "abcdefg";
        }

        @Override
        public String toString() {
            return "Document{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
}
