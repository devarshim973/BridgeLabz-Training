package com.linkedlist.CircularLinkedList.TaskScheduler;

public class TaskSchedulerApplication {

    public static void main(String[] args) {

        CircularTaskScheduler scheduler = new CircularTaskScheduler();

        scheduler.addAtEnd(1, "Design Module", 1, "2026-01-10");
        scheduler.addAtEnd(2, "Write Code", 2, "2026-01-12");
        scheduler.addAtBeginning(3, "Requirement Analysis", 1, "2026-01-08");
        scheduler.addAtPosition(2, 4, "Testing", 3, "2026-01-15");

        scheduler.displayAllTasks();

        scheduler.viewAndMoveNext();
        scheduler.viewAndMoveNext();

        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        scheduler.displayAllTasks();
    }
}
