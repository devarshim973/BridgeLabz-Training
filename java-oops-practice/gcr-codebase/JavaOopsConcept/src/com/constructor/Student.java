package com.constructor;


 public class Student {

    // Access modifiers
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter method for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public setter method for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Method to display student details
    void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + cgpa);
    }
}