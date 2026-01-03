package com.Day3.CabbyGoRideHailingApp;

public class CabbyGoApplication {

    public static void main(String[] args) {

        Driver driver1 = new Driver("aman", "LIC123", 4.8, "Downtown");
        Driver driver2 = new Driver("nikhil", "LIC456", 4.6, "Uptown");

        Vehicle mini = new Mini("MH01-AB1234", 4);
        Vehicle sedan = new Sedan("MH01-CD5678", 4);
        Vehicle suv = new SUV("MH01-EF9012", 6);

        IRideService rideService = new RideService();

        // Book rides
        rideService.bookRide(driver1, mini, 12.5);
        rideService.bookRide(driver2, suv, 20);

        // End rides
        rideService.endRide(driver1, mini);
        rideService.endRide(driver2, suv);
    }
}
