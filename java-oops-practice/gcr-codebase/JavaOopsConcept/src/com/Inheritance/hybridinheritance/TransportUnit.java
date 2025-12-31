package com.Inheritance.hybridinheritance;

public class TransportUnit {
    int maxSpeed;
    String model;

    TransportUnit(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void showDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
