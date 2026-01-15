package com.day4.HospitalQueue;

public class PatientRecord {

    private String patientName;
    private int criticalityLevel; // 1 (low) to 10 (high)

    public PatientRecord(String patientName, int criticalityLevel) {
        this.patientName = patientName;
        this.criticalityLevel = criticalityLevel;
    }

    public int getCriticalityLevel() {
        return criticalityLevel;
    }

    public String getPatientName() {
        return patientName;
    }

    public void displayPatient() {
        System.out.println(
            "Patient: " + patientName +
            ", Criticality Level: " + criticalityLevel
        );
    }
}
