package com.CSVDataHandling.AdvancedProblems.MergeTwoCSVFiles;

public class Student {

    int id;
    String name;
    int age;
    String marks;
    String grade;

    public Student(int id, String name, int age, String marks, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public String toCsv() {
        return id + "," + name + "," + age + "," + marks + "," + grade;
    }
}
