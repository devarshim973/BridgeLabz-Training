package com.Inheritance.hybridinheritance;

public class ElectricTransport extends TransportUnit {

    ElectricTransport(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}