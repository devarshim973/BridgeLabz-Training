package com.Inheritance.hybridinheritance;

public class DiningWaiter extends RestaurantPerson implements WorkerRole {

    int tableCount;

    public DiningWaiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tableCount);
        System.out.println("Duty: Serving customers");
    }
}