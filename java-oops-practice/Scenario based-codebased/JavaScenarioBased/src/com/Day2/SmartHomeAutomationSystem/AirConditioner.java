package com.Day2.SmartHomeAutomationSystem;

public class AirConditioner extends Appliance {

    public AirConditioner() {
        super(1500);
    }

    public AirConditioner(int energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("AC cooling started | Energy Usage: " + getEnergyUsage() + "W");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("AC stopped");
    }
}
