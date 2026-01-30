package FunctionalInterfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

public class RentalService {

    public static void main(String[] args) {

        RentalVehicle car = new Car();
        RentalVehicle bike = new Bike();
        RentalVehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
