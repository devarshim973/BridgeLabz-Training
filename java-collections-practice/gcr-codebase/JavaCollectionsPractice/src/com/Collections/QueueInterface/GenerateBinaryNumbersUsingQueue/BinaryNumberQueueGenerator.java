package com.Collections.QueueInterface.GenerateBinaryNumbersUsingQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class BinaryNumberQueueGenerator {

    public static List<String> generateBinaryNumbers(int n) {

        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        // Start with binary 1
        queue.add("1");

        for (int i = 0; i < n; i++) {

            String current = queue.remove();
            result.add(current);

            // Generate next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        List<String> binaries =
                generateBinaryNumbers(n);

        System.out.println(binaries);
    }
}
