package com.Collections.QueueInterface.HospitalTriageSystem;

import java.util.PriorityQueue;

class Patient {

    private String name;
    private int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }
}

