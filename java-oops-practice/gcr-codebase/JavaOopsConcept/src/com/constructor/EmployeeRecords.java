package com.constructor;

public class EmployeeRecords {

    public static void main(String[] args) {

        Manager manager =
                new Manager(501, "IT", 75000);

        manager.displayManagerDetails();

        System.out.println("----------------------------");

        // Modify salary using public method
        manager.setSalary(85000);

        System.out.println("After Salary Update:");
        manager.displayManagerDetails();
    }
}