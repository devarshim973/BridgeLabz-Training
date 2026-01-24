package com.Day1.ExamScanner;


import java.util.*;

public class ScorePriorityQueue {

    public static PriorityQueue<Map.Entry<String, Integer>> sortScores(
            Map<String, Integer> scoreMap) {

        PriorityQueue<Map.Entry<String, Integer>> queue =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );

        queue.addAll(scoreMap.entrySet());
        return queue;
    }
}
