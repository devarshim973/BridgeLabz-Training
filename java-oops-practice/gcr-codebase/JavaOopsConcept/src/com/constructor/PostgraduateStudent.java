package com.constructor;

public class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method demonstrating protected member access
    void displayPostgraduateDetails() {
        System.out.println("Roll Number     : " + rollNumber);   // public
        System.out.println("Name            : " + name);         // protected
        System.out.println("Specialization  : " + specialization);
        System.out.println("CGPA            : " + getCGPA());    // private via getter
    }
}

