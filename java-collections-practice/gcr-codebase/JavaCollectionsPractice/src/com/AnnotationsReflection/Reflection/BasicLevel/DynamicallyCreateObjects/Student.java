package com.AnnotationsReflection.Reflection.BasicLevel.DynamicallyCreateObjects;


public class Student {

    private int id;
    private String name;

    public Student() {
        this.id = 101;
        this.name = "Ritika";
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}
