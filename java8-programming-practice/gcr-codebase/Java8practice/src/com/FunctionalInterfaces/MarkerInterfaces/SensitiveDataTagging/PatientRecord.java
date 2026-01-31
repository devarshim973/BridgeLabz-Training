package com.FunctionalInterfaces.MarkerInterfaces.SensitiveDataTagging;

public class PatientRecord implements SensitiveData {

    private String patientName;
    private String diagnosis;

    public PatientRecord(String patientName, String diagnosis) {
        this.patientName = patientName;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "PatientRecord{patientName='" + patientName + "', diagnosis='" + diagnosis + "'}";
    }
}
