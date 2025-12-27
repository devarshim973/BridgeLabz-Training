package com.constructor;

public class Person {

    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {

        // Original object
        Person person1 = new Person("Ravi", 25);

        // Copying object using copy constructor
        Person person2 = new Person(person1);

        person1.display();
        person2.display();
    }
}

