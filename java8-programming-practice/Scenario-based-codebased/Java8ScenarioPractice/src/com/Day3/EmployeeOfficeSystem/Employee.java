package com.Day3.EmployeeOfficeSystem;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;
    private int experience; // in years

    public Employee(int id, String name, double salary, int experience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience + " years}";
    }
}