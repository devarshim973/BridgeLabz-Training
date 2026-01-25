package com.Collections.ListInterface.ReverseaList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReverser {

    public static void reverseList(List<Integer> list) {

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Before Reverse: " + numbers);

        reverseList(numbers);

        System.out.println("After Reverse: " + numbers);
    }
}
