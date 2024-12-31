package org.example;

public abstract class AbstractDevice implements Printing, Copying, Scanning {

    protected int id;
    protected DeviceState state;

    public AbstractDevice(int id) {
        this.id = id;
        this.state = DeviceState.READY;
    }

    public UserGUI.Document scan() {

        // scanning document

        System.out.println("Scanning complete");
        return new UserGUI.Document();
    }

    public void print(UserGUI.Document document) {
        //printing document

        System.out.println("Printing document - "+document.toString());
    }

    public void copy(UserGUI.Document document, int numberOfCopies) {

        //copying document

        for (int i = 0; i < numberOfCopies; i++) {
            System.out.println(" Making copy");
        }

    }

    public abstract void initDevice();

    public abstract DeviceState selfCheck();

    // Getters and Setters

}
