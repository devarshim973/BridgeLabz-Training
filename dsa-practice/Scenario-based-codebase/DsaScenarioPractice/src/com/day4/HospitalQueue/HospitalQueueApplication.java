package com.day4.HospitalQueue;

public class HospitalQueueApplication {

    public static void main(String[] args) {

        PatientRecord[] patients = {
            new PatientRecord("Ravi", 3),
            new PatientRecord("Anita", 9),
            new PatientRecord("Suresh", 5),
            new PatientRecord("Meena", 8),
            new PatientRecord("Kiran", 2)
        };

        System.out.println("Before Sorting:");
        for (PatientRecord patient : patients) {
            patient.displayPatient();
        }

        HospitalBubbleSorter sorter = new HospitalBubbleSorter();
        sorter.sortByCriticality(patients);

        System.out.println("\nAfter Sorting (By Criticality):");
        for (PatientRecord patient : patients) {
            patient.displayPatient();
        }
    }
}
