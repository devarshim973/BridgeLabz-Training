package com.constructor;

public class CarRental {

    // Instance variables
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; // fixed rental cost per day

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Not Assigned";
        rentalDays = 0;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + calculateTotalCost());
        System.out.println("----------------------------");
    }

    // Main method
    public static void main(String[] args) {

        // Using parameterized constructor
        CarRental rental1 = new CarRental("Ravi", "Swift", 5);
        rental1.displayDetails();

        // Using default constructor
        CarRental rental2 = new CarRental();
        rental2.displayDetails();
    }
}

