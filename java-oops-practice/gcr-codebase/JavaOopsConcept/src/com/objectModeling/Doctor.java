package com.objectModeling;

class Doctor {
    String name;
    String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Communication method
    void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting patient " + patient.name);
    }

    void showDoctor() {
        System.out.println("Doctor Name: " + name + ", Specialization: " + specialization);
    }
}