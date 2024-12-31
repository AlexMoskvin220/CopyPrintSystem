package org.example;

public class Canon extends AbstractDevice{
    public Canon(int id) {
        super(id);
    }


    @Override
    public void initDevice() {

        this.state = selfCheck();
    }

    @Override
    public DeviceState selfCheck() {

        // checking logic

        return DeviceState.NEEDS_MAINTENANCE;
    }
}
