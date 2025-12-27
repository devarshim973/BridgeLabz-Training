package com.constructor;

public class Circle {

    // Instance variable
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }

    // Main method
    public static void main(String[] args) {

        // Using default constructor
        Circle c1 = new Circle();

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);

        c1.calculateArea();
        c2.calculateArea();
    }
}



