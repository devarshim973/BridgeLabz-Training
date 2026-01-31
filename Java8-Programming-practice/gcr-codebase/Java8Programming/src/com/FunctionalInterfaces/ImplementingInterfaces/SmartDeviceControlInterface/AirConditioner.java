package FunctionalInterfaces.ImplementingInterfaces.SmartDeviceControlInterface;

public class AirConditioner implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("AC turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC turned OFF");
    }
}
