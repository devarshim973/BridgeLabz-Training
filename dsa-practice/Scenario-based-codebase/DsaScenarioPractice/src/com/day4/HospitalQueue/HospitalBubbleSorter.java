package com.day4.HospitalQueue;

public class HospitalBubbleSorter {

    public void sortByCriticality(PatientRecord[] patients) {

        int n = patients.length;

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Swap if next patient is more critical
                if (patients[j].getCriticalityLevel()
                        < patients[j + 1].getCriticalityLevel()) {

                    PatientRecord temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }
}
