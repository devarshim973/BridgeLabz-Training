package com.LinearandBinarySearch.BinarySearchSearch2DSortedMatrix;

public class MatrixSearchMainApp {

    public static void main(String[] args) {

        int[][] matrix = {
            { 1, 3, 5, 7 },
            { 10, 11, 16, 20 },
            { 23, 30, 34, 60 }
        };

        int target = 16;

        MatrixBinarySearchSolver solver =
                new MatrixBinarySearchSolver();

        boolean found =
                solver.searchTarget(matrix, target);

        System.out.println("Target found: " + found);
    }
}
