package FunctionalInterfaces.DefaultMethodsInterfaces.SmartVehicleDashboard;

public class VehicleDashboardApp {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar(85);

        System.out.println("=== Regular Car ===");
        car.displaySpeed();
        car.displayBattery(); // default method

        System.out.println("\n=== Electric Car ===");
        eCar.displaySpeed();
        eCar.displayBattery(); // overridden method
    }
}
