package com.Inheritance.hybridinheritance;

public class PetrolTransport extends TransportUnit implements FuelService {

    PetrolTransport(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}
