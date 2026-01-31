package com.FunctionalInterfaces.ImplementingInterfaces.SmartDeviceControlInterface;

public class SmartHomeController {

    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new Television();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
