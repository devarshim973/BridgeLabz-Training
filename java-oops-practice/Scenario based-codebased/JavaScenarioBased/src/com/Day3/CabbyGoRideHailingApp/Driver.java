package com.Day3.CabbyGoRideHailingApp;

public class Driver {

    private String name;
    private String licenseNumber;
    private double rating; // Encapsulated
    private String location; // Private sensitive info

    public Driver(String name, String licenseNumber, double rating, String location) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
        this.location = location;
    }

    // Getter for rating
    public double getRating() {
        return rating;
    }

    // Getter for location (if needed)
    public String getLocation() {
        return location;
    }

    // Display driver info
    public void displayInfo() {
        System.out.println("Driver: " + name + ", License: " + licenseNumber + ", Rating: " + rating);
    }
}
