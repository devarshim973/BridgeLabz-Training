package com.Day9.HomeNest;

class SmartLock extends SmartHomeDevice {

    public SmartLock(String deviceId) {
        super(deviceId, 0.2);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Door LOCKED");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Door UNLOCKED");
    }

    @Override
    public void reset() {
        turnOff();
        logFirmwareUpdate();
        System.out.println("Lock re-synced");
    }
}
