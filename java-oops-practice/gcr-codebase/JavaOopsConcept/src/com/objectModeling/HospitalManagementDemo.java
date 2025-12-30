package com.objectModeling;

public class HospitalManagementDemo {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor("Dr. Mehta", "Orthopedics");

        Patient p1 = new Patient("Ravi", 30);
        Patient p2 = new Patient("Anita", 25);

        hospital.addDoctor(0, d1);
        hospital.addDoctor(1, d2);

        hospital.addPatient(0, p1);
        hospital.addPatient(1, p2);

        hospital.showHospitalDetails();

        System.out.println("\nConsultations:");
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}