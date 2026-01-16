package com.Day5.CropMonitor;

import java.util.ArrayList;
import java.util.List;

public class CropMonitorApp {

    public static void main(String[] args) {

        List<SoilSensorRecord> sensorData = new ArrayList<>();

        sensorData.add(new SoilSensorRecord(1705300200L, 24.5));
        sensorData.add(new SoilSensorRecord(1705290000L, 22.1));
        sensorData.add(new SoilSensorRecord(1705311000L, 25.8));
        sensorData.add(new SoilSensorRecord(1705285000L, 21.9));

        System.out.println("Before Sorting:");
        for (SoilSensorRecord record : sensorData) {
            System.out.println(record);
        }

        SensorQuickSorter.quickSort(
                sensorData,
                0,
                sensorData.size() - 1
        );

        System.out.println("\nAfter Sorting (By Timestamp):");
        for (SoilSensorRecord record : sensorData) {
            System.out.println(record);
        }
    }
}
