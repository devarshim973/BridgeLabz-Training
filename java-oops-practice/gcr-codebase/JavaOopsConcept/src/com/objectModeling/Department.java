package com.objectModeling;

import java.util.ArrayList;

class Department {

    String departmentName;
    ArrayList<Employee> employees;

    Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    void showDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}
