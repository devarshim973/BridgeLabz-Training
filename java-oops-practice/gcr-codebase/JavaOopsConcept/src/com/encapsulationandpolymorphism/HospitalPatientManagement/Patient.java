package com.encapsulationandpolymorphism.HospitalPatientManagement;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulation)
    private String diagnosis;

    protected Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation: controlled access
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println(
                "Patient ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age
        );
    }
}
