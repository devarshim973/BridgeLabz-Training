package com.Day9.HomeNest;

class SmartThermostat extends SmartHomeDevice {

    public SmartThermostat(String deviceId) {
        super(deviceId, 2.5);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat cooling ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    @Override
    public void reset() {
        turnOff();
        logFirmwareUpdate();
        System.out.println("Thermostat temperature reset");
    }
}
