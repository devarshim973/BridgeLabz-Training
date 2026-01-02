package com.linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobinScheduler {

    private CpuProcessNode head;
    private CpuProcessNode tail;
    private int timeQuantum;
    private int processCount;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        this.head = null;
        this.tail = null;
        this.processCount = 0;
    }

    // Add process at end
    public void addProcess(int id, int burstTime, int priority) {
        CpuProcessNode newNode = new CpuProcessNode(id, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        processCount++;
    }

    // Execute Round Robin scheduling
    public void executeScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        CpuProcessNode current = head;
        int currentTime = 0;

        System.out.println("Starting Round Robin Scheduling\n");

        while (processCount > 0) {

            displayQueue();

            if (current.remainingTime > 0) {
                int executedTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= executedTime;
                currentTime += executedTime;

                // Update waiting time of other processes
                updateWaitingTime(current, executedTime);

                if (current.remainingTime == 0) {
                    current.turnAroundTime = currentTime;
                    removeProcess(current.processId);
                }
            }

            current = current.next;
        }

        System.out.println("\nScheduling Completed");
    }

    // Remove process after completion
    private void removeProcess(int processId) {
        if (head == null)
            return;

        CpuProcessNode temp = head;
        CpuProcessNode prev = tail;

        do {
            if (temp.processId == processId) {

                if (temp == head && temp == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }

                processCount--;
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);
    }

    // Update waiting time
    private void updateWaitingTime(CpuProcessNode running, int time) {
        CpuProcessNode temp = head;

        if (temp == null)
            return;

        do {
            if (temp != running && temp.remainingTime > 0) {
                temp.waitingTime += time;
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Display current circular queue
    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue Empty");
            return;
        }

        CpuProcessNode temp = head;
        System.out.print("Queue: ");

        do {
            System.out.print(
                "[P" + temp.processId +
                ", RT=" + temp.remainingTime + "] "
            );
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    // Display average times
    public void displayAverageTimes(CpuProcessNode[] processes) {
        double totalWT = 0, totalTAT = 0;

        for (CpuProcessNode p : processes) {
            totalWT += p.waitingTime;
            totalTAT += p.turnAroundTime;
        }

        System.out.println("\nAverage Waiting Time: " + (totalWT / processes.length));
        System.out.println("Average Turnaround Time: " + (totalTAT / processes.length));
    }
}

