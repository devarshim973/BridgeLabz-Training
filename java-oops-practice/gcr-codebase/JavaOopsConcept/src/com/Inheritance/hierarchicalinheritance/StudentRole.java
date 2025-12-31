package com.Inheritance.hierarchicalinheritance;

public class StudentRole extends PersonBase {
    String grade;

    StudentRole(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        showBasicInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}