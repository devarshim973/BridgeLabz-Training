package com.Collections.ListInterface.FindtheNthElementfromtheEnd;

import java.util.LinkedList;

public class NthFromEndFinder {

    public static String findNthFromEnd(
            LinkedList<String> list, int n) {

        if (n <= 0 || list.isEmpty()) {
            return null;
        }

        int firstPointer = 0;
        int secondPointer = 0;

        // Move second pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (secondPointer >= list.size()) {
                return null; // N is larger than list size
            }
            secondPointer++;
        }

        // Move both pointers until second reaches end
        while (secondPointer < list.size()) {
            firstPointer++;
            secondPointer++;
        }

        return list.get(firstPointer);
    }

    public static void main(String[] args) {

        LinkedList<String> letters = new LinkedList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");

        int n = 2;

        System.out.println("List: " + letters);

        String result =
                findNthFromEnd(letters, n);

        System.out.println(
                "Nth element from end (N=" + n + "): " + result
        );
    }
}
