package com.CSVDataHandling.BasicProblems.CSVFilePrintData;

public class StudentRecord {

    private String id;
    private String name;
    private int age;
    private int marks;

    public StudentRecord(String id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Age: " + age +
               ", Marks: " + marks;
    }
}
