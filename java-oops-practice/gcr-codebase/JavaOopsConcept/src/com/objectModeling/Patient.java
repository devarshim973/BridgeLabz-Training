package com.objectModeling;

class Patient {
    String name;
    int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPatient() {
        System.out.println("Patient Name: " + name + ", Age: " + age);
    }
}