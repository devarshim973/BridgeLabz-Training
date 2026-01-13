package com.Day9.HomeNest;

class SmartLight extends SmartHomeDevice {

    public SmartLight(String deviceId) {
        super(deviceId, 0.5);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON: " + getDeviceId());
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF: " + getDeviceId());
    }

    @Override
    public void reset() {
        turnOff();
        logFirmwareUpdate();
        System.out.println("Light reset completed");
    }
}
