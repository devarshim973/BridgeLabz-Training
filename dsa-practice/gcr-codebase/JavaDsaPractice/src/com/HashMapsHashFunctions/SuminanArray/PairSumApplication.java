package com.HashMapsHashFunctions.SuminanArray;

public class PairSumApplication {

    public static void main(String[] args) {

        int[] array = {8, 7, 2, 5, 3, 1};
        int targetSum = 10;

        PairSumChecker checker = new PairSumChecker();

        checker.hasPairWithSum(array, targetSum);
    }
}

