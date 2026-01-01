package com.encapsulationandpolymorphism.HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementApplication {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        InPatient inpatient = new InPatient(
                101, "Amit", 45, 5, 2000
        );
        inpatient.addRecord("Pneumonia");

        OutPatient outpatient = new OutPatient(
                102, "Neha", 30, 800
        );
        outpatient.addRecord("Migraine");

        patients.add(inpatient);
        patients.add(outpatient);

        BillingProcessor.processPatients(patients);

        // Viewing medical records
        inpatient.viewRecords();
        outpatient.viewRecords();
    }
}

