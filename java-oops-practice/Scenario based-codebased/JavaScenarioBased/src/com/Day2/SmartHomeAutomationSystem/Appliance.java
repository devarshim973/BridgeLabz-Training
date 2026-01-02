package com.Day2.SmartHomeAutomationSystem;

public abstract class Appliance implements Controllable {
    private boolean powerStatus;
    private int energyUsage;

    public Appliance() {
        this.powerStatus = false;
        this.energyUsage = 0;
    }

    public Appliance(int energyUsage) {
        this.powerStatus = false;
        this.energyUsage = energyUsage;
    }

    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }

    protected void setEnergyUsage(int energyUsage) {
        this.energyUsage = energyUsage;
    }

    public boolean isPowerOn() {
        return powerStatus;
    }

    public int getEnergyUsage() {
        return energyUsage;
    }
}
