package com.LinearandBinarySearch.BinarySearchFindRotationPoint;

public class RotationSearchMainApp {

    public static void main(String[] args) {

        int[] rotatedArray = { 6, 7, 8, 1, 2, 3, 4, 5 };

        RotationPointBinaryFinder finder =
                new RotationPointBinaryFinder();

        int rotationIndex =
                finder.findRotationIndex(rotatedArray);

        System.out.println(
            "Rotation point index: " + rotationIndex
        );
        System.out.println(
            "Smallest element: " + rotatedArray[rotationIndex]
        );
    }
}
