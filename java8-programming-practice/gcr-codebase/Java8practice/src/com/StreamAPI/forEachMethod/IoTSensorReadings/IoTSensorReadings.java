package com.StreamAPI.forEachMethod.IoTSensorReadings;

import java.util.*;

public class IoTSensorReadings {

    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(
            22.5, 35.2, 18.9, 42.0, 30.1, 15.6
        );

        double threshold = 30.0;

        sensorReadings.stream()

            // filter readings above threshold
            .filter(reading -> reading > threshold)

            // print readings
            .forEach(reading ->
                System.out.println("High Reading Detected: " + reading)
            );
    }
}
