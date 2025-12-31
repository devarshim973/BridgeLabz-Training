package com.Inheritance.hierarchicalinheritance;

public class StaffRole extends PersonBase {
    String department;

    StaffRole(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        showBasicInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}