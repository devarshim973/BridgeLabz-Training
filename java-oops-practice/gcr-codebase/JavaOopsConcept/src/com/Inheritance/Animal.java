package com.Inheritance;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}