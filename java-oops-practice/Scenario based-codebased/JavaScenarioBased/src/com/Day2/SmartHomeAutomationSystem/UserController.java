package com.Day2.SmartHomeAutomationSystem;

public class UserController {

    public void operateDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareEnergyUsage(Appliance a1, Appliance a2) {
        if (a1.getEnergyUsage() > a2.getEnergyUsage()) {
            System.out.println("First appliance consumes more energy");
        } else if (a1.getEnergyUsage() < a2.getEnergyUsage()) {
            System.out.println("Second appliance consumes more energy");
        } else {
            System.out.println("Both appliances consume equal energy");
        }
    }
}

