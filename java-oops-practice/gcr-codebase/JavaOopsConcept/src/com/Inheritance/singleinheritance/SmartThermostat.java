package com.Inheritance.singleinheritance;

public class SmartThermostat extends SmartDevice {
    double temperatureSetting; // in Celsius

    public SmartThermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override to include thermostat-specific info
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
