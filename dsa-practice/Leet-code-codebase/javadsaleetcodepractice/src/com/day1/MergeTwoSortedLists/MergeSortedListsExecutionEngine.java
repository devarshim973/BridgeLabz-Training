package com.day1.MergeTwoSortedLists;

class MergeSortedListsExecutionEngine {

    public static void main(String[] args) {

        // list1 = [1,2,4]
        SortedListNode list1 = new SortedListNode(1);
        list1.next = new SortedListNode(2);
        list1.next.next = new SortedListNode(4);

        // list2 = [1,3,4]
        SortedListNode list2 = new SortedListNode(1);
        list2.next = new SortedListNode(3);
        list2.next.next = new SortedListNode(4);

        MergeSortedListsSolution solution =
                new MergeSortedListsSolution();

        SortedListNode merged =
                solution.mergeTwoLists(list1, list2);

        printList(merged);
    }

    private static void printList(SortedListNode head) {
        while (head != null) {
            System.out.print(head.value + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}
