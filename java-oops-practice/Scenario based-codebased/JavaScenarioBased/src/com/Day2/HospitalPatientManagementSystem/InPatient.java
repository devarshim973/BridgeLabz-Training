package com.Day2.HospitalPatientManagementSystem;

public class InPatient extends Patient {
    private int stayDays;

    // Normal admission
    public InPatient(int id, String name, String history, int stayDays) {
        super(id, name, history);
        this.stayDays = stayDays;
    }

    // Emergency admission (constructor overloading)
    public InPatient(int id, String name, String history) {
        super(id, name, history);
        this.stayDays = 1;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() +
                ", Type: InPatient, Days Admitted: " + stayDays);
    }

    public int getStayDays() {
        return stayDays;
    }
}

