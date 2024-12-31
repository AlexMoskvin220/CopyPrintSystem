package org.example;

public class Minolta extends AbstractDevice{
    public Minolta(int id) {
        super(id);
    }

    @Override
    public void initDevice() {

        this.state = selfCheck();
    }

    @Override
    public DeviceState selfCheck() {

        // checking logic

        return DeviceState.OUT_OF_SERVICE;
    }
}
