package com.Sorting.InsertionSortSortEmployeeIDs;

public class InsertionSortUtility {

    public static void sortAscending(int[] employeeIds) {

        int n = employeeIds.length;

        // Start from second element
        for (int i = 1; i < n; i++) {

            int key = employeeIds[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            // Insert key at correct position
            employeeIds[j + 1] = key;
        }
    }
}
