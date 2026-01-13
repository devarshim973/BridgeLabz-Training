package com.Day9.HomeNest;

abstract class SmartHomeDevice implements IControllable {

    private String deviceId;
    private boolean status;          // Encapsulated
    protected double energyUsage;    // Accessible to subclasses

    protected SmartHomeDevice(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    // Public read-only access
    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    // Controlled state change
    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Energy calculation using operators
    public double calculateEnergyUsage(int hours) {
        return energyUsage * hours;
    }

    // Firmware logs secured
    protected void logFirmwareUpdate() {
        System.out.println("Firmware updated for device: " + deviceId);
    }
}
