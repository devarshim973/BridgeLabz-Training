package com.Inheritance.hybridinheritance;

public class TransportDemo {
    public static void main(String[] args) {

        ElectricTransport ev = new ElectricTransport(150, "EV-X1");
        PetrolTransport pv = new PetrolTransport(180, "Petro-Z9");

        System.out.println("Electric Vehicle Details:");
        ev.showDetails();
        ev.charge();

        System.out.println("\nPetrol Vehicle Details:");
        pv.showDetails();
        pv.refuel();
    }
}