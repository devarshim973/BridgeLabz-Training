package com.Day2.SmartHomeAutomationSystem;

public class SmartHomeApplication {
    public static void main(String[] args) {

        Appliance livingRoomLight = new Light();
        Appliance ceilingFan = new Fan(90);
        Appliance bedroomAC = new AirConditioner();

        UserController controller = new UserController();

        controller.operateDevice(livingRoomLight, true);
        controller.operateDevice(ceilingFan, true);
        controller.operateDevice(bedroomAC, true);

        controller.compareEnergyUsage(ceilingFan, bedroomAC);

        controller.operateDevice(bedroomAC, false);
    }
}
