package com.Day5.CropMonitor;

public class SoilSensorRecord {

    private long timestamp;
    private double temperature;

    public SoilSensorRecord(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Time: " + timestamp + ", Temp: " + temperature;
    }
}
