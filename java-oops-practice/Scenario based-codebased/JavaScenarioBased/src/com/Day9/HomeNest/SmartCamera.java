package com.Day9.HomeNest;

class SmartCamera extends SmartHomeDevice {

    public SmartCamera(String deviceId) {
        super(deviceId, 1.2);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Camera recording stopped");
    }

    @Override
    public void reset() {
        turnOff();
        logFirmwareUpdate();
        System.out.println("Camera recalibrated");
    }
}
