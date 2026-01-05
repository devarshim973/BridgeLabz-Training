package com.Sorting.HeapSortSortJobApplicantsbySalary;

public class HeapSortSalaryProcessor {

    public static void sortAscending(int[] salaries) {

        int size = salaries.length;

        // Step 1: Build Max Heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(salaries, size, i);
        }

        // Step 2: Extract elements one by one
        for (int i = size - 1; i > 0; i--) {

            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    private static void heapify(int[] salaries, int heapSize, int rootIndex) {

        int largestIndex = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && salaries[leftChild] > salaries[largestIndex]) {
            largestIndex = leftChild;
        }

        if (rightChild < heapSize && salaries[rightChild] > salaries[largestIndex]) {
            largestIndex = rightChild;
        }

        if (largestIndex != rootIndex) {

            int swap = salaries[rootIndex];
            salaries[rootIndex] = salaries[largestIndex];
            salaries[largestIndex] = swap;

            heapify(salaries, heapSize, largestIndex);
        }
    }
}
