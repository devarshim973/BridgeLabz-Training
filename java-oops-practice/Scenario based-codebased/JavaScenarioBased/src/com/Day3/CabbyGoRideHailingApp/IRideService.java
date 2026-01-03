package com.Day3.CabbyGoRideHailingApp;

public interface IRideService {

    void bookRide(Driver driver, Vehicle vehicle, double distance);

    void endRide(Driver driver, Vehicle vehicle);
}
