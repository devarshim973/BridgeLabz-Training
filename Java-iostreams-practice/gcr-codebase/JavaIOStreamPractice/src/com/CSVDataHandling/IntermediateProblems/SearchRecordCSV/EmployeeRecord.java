package com.CSVDataHandling.IntermediateProblems.SearchRecordCSV;

public class EmployeeRecord {

    private String department;
    private double salary;

    public EmployeeRecord(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Department: " + department + ", Salary: " + salary;
    }
}
