package com.StacksandQueues.CircularTourProblem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTourService {

    public int findStartingPump(int[] petrol, int[] distance) {

        int n = petrol.length;
        Queue<Integer> pumpQueue = new LinkedList<>();

        int start = 0;
        int surplus = 0;
        int count = 0;

        int i = 0;

        while (count < n) {

            surplus += petrol[i] - distance[i];
            pumpQueue.offer(i);

            // If surplus becomes negative, reset
            while (surplus < 0 && !pumpQueue.isEmpty()) {
                int removedPump = pumpQueue.poll();
                surplus -= (petrol[removedPump] - distance[removedPump]);
                start = removedPump + 1;
                count--;
            }

            i = (i + 1) % n;
            count++;
        }

        return (surplus >= 0 && pumpQueue.size() == n) ? start : -1;
    }
}
