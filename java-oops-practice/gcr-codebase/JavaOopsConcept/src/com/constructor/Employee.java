package com.constructor;

class Employee {

    // Access modifiers
    public int employeeID;          // public
    protected String department;    // protected
    private double salary;          // private

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter method for salary (private variable)
    public double getSalary() {
        return salary;
    }

    // Setter method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}

