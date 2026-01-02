package com.linkedlist.CircularLinkedList.TaskScheduler;

public class CircularTaskScheduler {

    private SchedulerTaskNode head;
    private SchedulerTaskNode tail;
    private SchedulerTaskNode current;

    public CircularTaskScheduler() {
        head = null;
        tail = null;
        current = null;
    }

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        SchedulerTaskNode newNode = new SchedulerTaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        SchedulerTaskNode newNode = new SchedulerTaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    // Add at specific position
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        SchedulerTaskNode temp = head;
        int index = 1;

        while (index < position - 1 && temp.next != head) {
            temp = temp.next;
            index++;
        }

        if (temp == tail) {
            addAtEnd(id, name, priority, dueDate);
            return;
        }

        SchedulerTaskNode newNode = new SchedulerTaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("No tasks to remove");
            return;
        }

        SchedulerTaskNode temp = head;
        SchedulerTaskNode prev = tail;

        do {
            if (temp.taskId == taskId) {

                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                    current = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }

                System.out.println("Task removed");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewAndMoveNext() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        SchedulerTaskNode temp = head;
        System.out.println("Task List:");

        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        SchedulerTaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks found with given priority");
    }

    private void displayTask(SchedulerTaskNode task) {
        System.out.println(
                "ID: " + task.taskId +
                ", Name: " + task.taskName +
                ", Priority: " + task.priority +
                ", Due Date: " + task.dueDate
        );
    }
}
