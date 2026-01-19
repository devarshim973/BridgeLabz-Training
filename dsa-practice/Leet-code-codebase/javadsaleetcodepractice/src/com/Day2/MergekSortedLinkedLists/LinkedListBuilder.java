package com.Day2.MergekSortedLinkedLists;

public class LinkedListBuilder {

    public static ListNodeElement createList(int[] values) {

        if (values.length == 0) return null;

        ListNodeElement head = new ListNodeElement(values[0]);
        ListNodeElement current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNodeElement(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNodeElement head) {

        while (head != null) {
            System.out.print(head.value);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}
