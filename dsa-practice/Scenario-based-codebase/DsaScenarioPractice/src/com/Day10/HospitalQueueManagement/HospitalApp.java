package com.Day10.HospitalQueueManagement;

public class HospitalApp {

    public static void main(String[] args) {

        HospitalAVL hospital = new HospitalAVL();

        hospital.registerPatient(900, "Rahul");
        hospital.registerPatient(830, "Anita");
        hospital.registerPatient(1000, "Suresh");
        hospital.registerPatient(845, "Neha");

        hospital.displayPatients();

        System.out.println("\n❌ Discharging patient at 845\n");
        hospital.dischargePatient(845);

        hospital.displayPatients();
    }
}
