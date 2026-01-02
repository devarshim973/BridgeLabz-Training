package com.Day2.SmartHomeAutomationSystem;

public class Light extends Appliance {

    public Light() {
        super(10);
    }

    public Light(int energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light turned ON | Energy Usage: " + getEnergyUsage() + "W");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Light turned OFF");
    }
}
