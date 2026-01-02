package com.Day2.HospitalPatientManagementSystem;

public class HospitalManagementApplication {
    public static void main(String[] args) {

        Patient patientA = new InPatient(101, "abhishek", "Diabetes", 5);
        Patient patientB = new OutPatient(102, "Aniruddha", "Cold & Fever");

        Doctor doctorAssigned = new Doctor(301, "Dr. mishra", "Physician");

        Bill hospitalBill = new Bill(6000, 0.18, 500);

        patientA.displayInfo();
        patientB.displayInfo();
        doctorAssigned.displayInfo();

        System.out.println("Final Bill Amount: ₹" + hospitalBill.calculatePayment());
    }
}
