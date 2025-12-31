package com.Inheritance.hybridinheritance;

public class RestaurantHybridDemo {
    public static void main(String[] args) {

        KitchenChef chef = new KitchenChef("Ramesh", 101, "Indian Cuisine");
        DiningWaiter waiter = new DiningWaiter("Suresh", 102, 5);

        System.out.println("=== Chef Details ===");
        chef.showPersonInfo();
        chef.performDuties();

        System.out.println("\n=== Waiter Details ===");
        waiter.showPersonInfo();
        waiter.performDuties();
    }
}