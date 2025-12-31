package com.Inheritance.hybridinheritance;

public class KitchenChef extends RestaurantPerson implements WorkerRole {

    String specialty;

    public KitchenChef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duty: Cooking delicious food");
    }
}
