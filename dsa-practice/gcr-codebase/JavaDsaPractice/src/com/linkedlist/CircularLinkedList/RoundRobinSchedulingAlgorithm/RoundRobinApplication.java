package com.linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobinApplication {

    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

        CpuProcessNode[] processes = new CpuProcessNode[3];

        processes[0] = new CpuProcessNode(1, 10, 1);
        processes[1] = new CpuProcessNode(2, 5, 2);
        processes[2] = new CpuProcessNode(3, 8, 1);

        // Add processes to scheduler
        for (CpuProcessNode p : processes) {
            scheduler.addProcess(p.processId, p.burstTime, p.priority);
        }

        scheduler.executeScheduling();

        scheduler.displayAverageTimes(processes);
    }
}
