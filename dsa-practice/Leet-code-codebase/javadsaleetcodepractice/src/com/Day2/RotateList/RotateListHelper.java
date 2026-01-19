package com.Day2.RotateList;

public class RotateListHelper {

    public static RotateNode createList(int[] values) {

        if (values.length == 0) return null;

        RotateNode head = new RotateNode(values[0]);
        RotateNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new RotateNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(RotateNode head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}
