package com.encapsulationandpolymorphism.EmployeeManagementSystem;

public abstract class Employee implements Department {

    private int employeeId;
    private String name;
    private double baseSalary;
    protected String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters & Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println(
                "ID: " + employeeId +
                ", Name: " + name +
                ", Department: " + department +
                ", Salary: " + calculateSalary()
        );
    }

    // Interface methods
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
