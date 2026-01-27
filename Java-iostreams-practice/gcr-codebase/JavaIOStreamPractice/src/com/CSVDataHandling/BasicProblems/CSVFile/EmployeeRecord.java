package com.CSVDataHandling.BasicProblems.CSVFile;

public class EmployeeRecord {

    private int id;
    private String name;
    private String department;
    private double salary;

    public EmployeeRecord(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toCsv() {
        return id + "," + name + "," + department + "," + salary;
    }
}
