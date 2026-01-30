package FunctionalInterfaces.ImplementingInterfaces.SmartDeviceControlInterface;

public class Television implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}
