package com.day1.RemoveNthNodeEndList;

class RemoveNthNodeExecutionEngine {

    public static void main(String[] args) {

        // Creating list: 1 → 2 → 3 → 4 → 5
        SingleListNode head = new SingleListNode(1);
        head.next = new SingleListNode(2);
        head.next.next = new SingleListNode(3);
        head.next.next.next = new SingleListNode(4);
        head.next.next.next.next = new SingleListNode(5);

        RemoveNthFromEndSolution solution =
                new RemoveNthFromEndSolution();

        head = solution.removeNthFromEnd(head, 2);

        printList(head);
    }

    private static void printList(SingleListNode head) {
        while (head != null) {
            System.out.print(head.value + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}
