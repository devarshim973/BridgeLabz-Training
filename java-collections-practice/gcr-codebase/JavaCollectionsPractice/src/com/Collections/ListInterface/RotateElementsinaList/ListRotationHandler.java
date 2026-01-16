package com.Collections.ListInterface.RotateElementsinaList;

import java.util.ArrayList;
import java.util.List;

public class ListRotationHandler {

    public static List<Integer> rotateList(
            List<Integer> list, int rotateBy) {

        int size = list.size();
        List<Integer> rotatedList = new ArrayList<>();

        // Normalize rotation (important for large rotateBy)
        rotateBy = rotateBy % size;

        // Add elements from rotateBy index to end
        for (int i = rotateBy; i < size; i++) {
            rotatedList.add(list.get(i));
        }

        // Add elements from start to rotateBy index
        for (int i = 0; i < rotateBy; i++) {
            rotatedList.add(list.get(i));
        }

        return rotatedList;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int rotateBy = 2;

        System.out.println("Original List: " + numbers);

        List<Integer> result =
                rotateList(numbers, rotateBy);

        System.out.println(
                "List after rotating by " + rotateBy + ": " + result
        );
    }
}
