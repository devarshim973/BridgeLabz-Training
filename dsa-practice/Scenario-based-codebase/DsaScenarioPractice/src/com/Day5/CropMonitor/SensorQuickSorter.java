package com.Day5.CropMonitor;

import java.util.List;

public class SensorQuickSorter {

    public static void quickSort(
            List<SoilSensorRecord> records,
            int low,
            int high) {

        if (low < high) {
            int pivotIndex = partition(records, low, high);

            quickSort(records, low, pivotIndex - 1);
            quickSort(records, pivotIndex + 1, high);
        }
    }

    private static int partition(
            List<SoilSensorRecord> records,
            int low,
            int high) {

        long pivotTime = records.get(high).getTimestamp();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (records.get(j).getTimestamp() <= pivotTime) {
                i++;
                swap(records, i, j);
            }
        }

        swap(records, i + 1, high);
        return i + 1;
    }

    private static void swap(
            List<SoilSensorRecord> records,
            int i,
            int j) {

        SoilSensorRecord temp = records.get(i);
        records.set(i, records.get(j));
        records.set(j, temp);
    }
}
