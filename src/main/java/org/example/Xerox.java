package org.example;

public class Xerox extends AbstractDevice {
    public Xerox(int id) {
        super(id);
    }

       @Override
    public void initDevice() {

        this.state = selfCheck();
    }

    @Override
    public DeviceState selfCheck() {

        // checking logic

        return DeviceState.READY;
    }

}
