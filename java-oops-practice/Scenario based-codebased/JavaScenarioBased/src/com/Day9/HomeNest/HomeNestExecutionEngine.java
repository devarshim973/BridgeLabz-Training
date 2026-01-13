package com.Day9.HomeNest;

class HomeNestExecutionEngine {

    public static void main(String[] args) {

        SmartHomeDevice light =
                new SmartLight("LIGHT-101");

        SmartHomeDevice camera =
                new SmartCamera("CAM-202");

        SmartHomeDevice ac =
                new SmartThermostat("AC-303");

        SmartHomeDevice lock =
                new SmartLock("LOCK-404");

        light.turnOn();
        camera.turnOn();
        ac.turnOn();
        lock.turnOn();

        System.out.println("AC Energy (5 hrs): " +
                ac.calculateEnergyUsage(5));

        camera.reset();
        lock.reset();
    }
}
