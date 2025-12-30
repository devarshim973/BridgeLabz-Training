package com.objectModeling;

class Employee {

    String employeeName;

    Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    void showEmployee() {
        System.out.println("Employee: " + employeeName);
    }
}
