package com.LinearandBinarySearch.ChallengeProblem2;

public class SearchChallengeMainApp {

    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};
        int target = 4;

        // Linear Search: First Missing Positive
        LinearSearchFirstMissing linearSearch = new LinearSearchFirstMissing();
        int missing = linearSearch.findFirstMissingPositive(nums.clone()); // clone to avoid modifying original
        System.out.println("First missing positive integer: " + missing);

        // Binary Search: Find Target Index
        BinarySearchTargetFinder binarySearch = new BinarySearchTargetFinder();
        int targetIndex = binarySearch.findTargetIndex(nums.clone(), target); // clone to avoid modifying original
        System.out.println("Target " + target + " index in sorted array: " + targetIndex);
    }
}
