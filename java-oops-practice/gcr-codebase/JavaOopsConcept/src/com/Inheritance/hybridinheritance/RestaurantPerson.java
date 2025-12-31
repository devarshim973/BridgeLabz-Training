package com.Inheritance.hybridinheritance;

public class RestaurantPerson {
    String name;
    int id;

    public RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
