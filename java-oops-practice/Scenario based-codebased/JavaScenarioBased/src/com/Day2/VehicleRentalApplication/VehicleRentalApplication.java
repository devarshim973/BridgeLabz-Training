package com.Day2.VehicleRentalApplication;

public class VehicleRentalApplication {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Amit");

        Rentable bike = new Bike(101, "Yamaha", 300);
        Rentable car = new Car(102, "Honda", 1500);
        Rentable truck = new Truck(103, "Tata", 2500);

        customer.displayCustomerInfo();

        System.out.println("Bike Rent for 3 days: ₹" + bike.calculateRent(3));
        System.out.println("Car Rent for 3 days: ₹" + car.calculateRent(3));
        System.out.println("Truck Rent for 3 days: ₹" + truck.calculateRent(3));
    }
}
