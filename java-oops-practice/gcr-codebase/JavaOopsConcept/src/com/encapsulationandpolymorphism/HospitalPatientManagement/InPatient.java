package com.encapsulationandpolymorphism.HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;
    private List<String> medicalHistory = new ArrayList<>();

    public InPatient(int patientId, String name, int age,
                     int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
        setDiagnosis(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("In-Patient Medical Records:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}
