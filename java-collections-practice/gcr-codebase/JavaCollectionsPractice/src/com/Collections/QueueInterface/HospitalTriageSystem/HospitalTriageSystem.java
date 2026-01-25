package com.Collections.QueueInterface.HospitalTriageSystem;

import java.util.PriorityQueue;

public class HospitalTriageSystem {

    public static void main(String[] args) {

        // PriorityQueue: Higher severity comes first
        PriorityQueue<Patient> triageQueue =
                new PriorityQueue<>(
                        (p1, p2) -> p2.getSeverity() - p1.getSeverity()
                );

        // Adding patients
        triageQueue.add(new Patient("aman", 3));
        triageQueue.add(new Patient("nikhil", 5));
        triageQueue.add(new Patient("dubey", 2));

        System.out.println("Treatment Order:");

        // Treat patients based on priority
        while (!triageQueue.isEmpty()) {
            Patient patient = triageQueue.poll();
            System.out.println(patient.getName());
        }
    }
}
