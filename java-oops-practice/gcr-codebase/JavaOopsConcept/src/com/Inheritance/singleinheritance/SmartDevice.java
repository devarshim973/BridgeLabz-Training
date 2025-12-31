package com.Inheritance.singleinheritance;

public class SmartDevice {
    String deviceId;
    boolean status; // true = ON, false = OFF

    public SmartDevice(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display basic device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}