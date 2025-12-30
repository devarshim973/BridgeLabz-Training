package com.objectModeling;

class Hospital {
    String hospitalName;
    Doctor[] doctors;
    Patient[] patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new Doctor[2];
        patients = new Patient[2];
    }

    void addDoctor(int index, Doctor doctor) {
        doctors[index] = doctor;
    }

    void addPatient(int index, Patient patient) {
        patients[index] = patient;
    }

    void showHospitalDetails() {
        System.out.println("\nHospital: " + hospitalName);

        System.out.println("\nDoctors:");
        for (Doctor d : doctors) {
            if (d != null) d.showDoctor();
        }

        System.out.println("\nPatients:");
        for (Patient p : patients) {
            if (p != null) p.showPatient();
        }
    }
}
