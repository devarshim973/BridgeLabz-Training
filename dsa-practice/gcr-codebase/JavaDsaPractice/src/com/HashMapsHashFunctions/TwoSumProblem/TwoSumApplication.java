package com.HashMapsHashFunctions.TwoSumProblem;

public class TwoSumApplication {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        TwoSumIndexFinder finder = new TwoSumIndexFinder();

        int[] result = finder.findTwoSumIndices(numbers, target);

        if (result[0] != -1) {
            System.out.println(
                "Indices: " + result[0] + ", " + result[1]
            );
        } else {
            System.out.println("No valid pair found");
        }
    }
}
