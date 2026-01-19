package com.Day7.FitnessTracker;

import java.util.List;

public class BubbleSortStepEngine {

    public static void bubbleSort(List<FitnessUserRecord> users) {

        int n = users.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (users.get(j).getStepCount() < users.get(j + 1).getStepCount()) {

                    FitnessUserRecord temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
