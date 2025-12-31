package com.Inheritance;

public class Intern extends Employee {
    String university;

    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, University: " + university);
    }
}