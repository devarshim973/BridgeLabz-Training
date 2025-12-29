package com.constructor;

public class Manager extends Employee {

    // Constructor
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to demonstrate access modifiers
    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : " + getSalary());  // private via getter
    }
}

