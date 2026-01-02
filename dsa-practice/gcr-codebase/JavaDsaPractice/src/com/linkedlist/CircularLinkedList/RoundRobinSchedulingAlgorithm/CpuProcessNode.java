package com.linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class CpuProcessNode {

    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    int waitingTime;
    int turnAroundTime;

    CpuProcessNode next;

    public CpuProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnAroundTime = 0;
        this.next = null;
    }
}
