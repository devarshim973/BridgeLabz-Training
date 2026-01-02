package com.Day2.HospitalPatientManagementSystem;

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String specialization;

    public Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor ID: " + doctorId +
                ", Name: " + doctorName +
                ", Specialization: " + specialization);
    }
}
