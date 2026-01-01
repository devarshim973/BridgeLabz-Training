package com.encapsulationandpolymorphism.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementApplication {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee empOne =
                new FullTimeEmployee(101, "Ravi", 60000);

        Employee empTwo =
                new PartTimeEmployee(102, "Pooja", 500, 80);

        empOne.assignDepartment("Finance");
        empTwo.assignDepartment("IT");

        employeeList.add(empOne);
        employeeList.add(empTwo);

        // Polymorphism: Employee reference
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
