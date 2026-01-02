package com.Day2.HospitalPatientManagementSystem;

public class OutPatient extends Patient {

    public OutPatient(int id, String name, String history) {
        super(id, name, history);
    }

    //Override
    public void displayInfo() {
        System.out.println(getSummary() + ", Type: OutPatient");
    }
}
