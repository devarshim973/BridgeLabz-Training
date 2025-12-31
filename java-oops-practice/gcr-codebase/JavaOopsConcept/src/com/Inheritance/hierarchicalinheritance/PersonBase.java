package com.Inheritance.hierarchicalinheritance;

public class PersonBase {
    String name;
    int age;

    PersonBase(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}