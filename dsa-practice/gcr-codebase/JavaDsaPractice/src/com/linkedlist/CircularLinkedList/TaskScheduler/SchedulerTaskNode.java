package com.linkedlist.CircularLinkedList.TaskScheduler;

public class SchedulerTaskNode {

    int taskId;
    String taskName;
    int priority;
    String dueDate;

    SchedulerTaskNode next;

    public SchedulerTaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

