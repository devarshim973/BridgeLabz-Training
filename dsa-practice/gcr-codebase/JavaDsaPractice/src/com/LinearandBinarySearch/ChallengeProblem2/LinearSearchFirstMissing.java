package com.LinearandBinarySearch.ChallengeProblem2;

public class LinearSearchFirstMissing {

    // Find first missing positive integer
    public int findFirstMissingPositive(int[] nums) {

        int n = nums.length;

        // Step 1: Place each number in its correct index position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]) {
                // Swap nums[i] with nums[nums[i]-1]
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find first index where nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // All numbers 1..n are present
        return n + 1;
    }
}
