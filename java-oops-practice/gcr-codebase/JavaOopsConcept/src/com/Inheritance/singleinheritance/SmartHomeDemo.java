package com.Inheritance.singleinheritance;

public class SmartHomeDemo {
    public static void main(String[] args) {

        // Create devices
        SmartDevice light = new SmartDevice("L001", true);
        SmartThermostat thermostat = new SmartThermostat("T001", true, 24.5);

        // Display status of devices
        System.out.println("Smart Home Devices Status:\n");

        SmartDevice[] devices = {light, thermostat};

        for (SmartDevice d : devices) {
            d.displayStatus();
            System.out.println("---------------------");
        }
    }
}