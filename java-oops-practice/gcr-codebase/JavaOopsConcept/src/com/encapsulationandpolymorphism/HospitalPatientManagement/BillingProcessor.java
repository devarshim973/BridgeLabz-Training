package com.encapsulationandpolymorphism.HospitalPatientManagement;

import java.util.List;

class BillingProcessor {

    public static void processPatients(List<Patient> patients) {

        for (Patient patient : patients) {

            patient.getPatientDetails();

            double billAmount = patient.calculateBill();
            System.out.println("Total Bill: ₹" + billAmount);

            System.out.println("-----------------------------");
        }
    }
}
