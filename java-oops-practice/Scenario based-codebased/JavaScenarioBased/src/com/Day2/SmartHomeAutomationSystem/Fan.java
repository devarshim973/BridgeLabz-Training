package com.Day2.SmartHomeAutomationSystem;

public class Fan extends Appliance {

    public Fan() {
        super(75);
    }

    public Fan(int energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan started | Energy Usage: " + getEnergyUsage() + "W");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan stopped");
    }
}
