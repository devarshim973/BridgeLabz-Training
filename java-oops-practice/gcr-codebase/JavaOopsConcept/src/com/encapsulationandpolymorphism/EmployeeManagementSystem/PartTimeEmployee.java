package com.encapsulationandpolymorphism.EmployeeManagementSystem;

public class PartTimeEmployee extends Employee {

    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name,
                            double hourlyRate, int workHours) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workHours;
    }
}
