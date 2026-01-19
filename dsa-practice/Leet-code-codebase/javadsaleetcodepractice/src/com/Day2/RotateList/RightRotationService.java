package com.Day2.RotateList;

public class RightRotationService {

    public static RotateNode rotateRight(RotateNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        RotateNode tail = head;
        int length = 1;

        // Find length and tail
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Make circular list
        tail.next = head;

        // Normalize k
        k = k % length;
        int stepsToNewHead = length - k;

        RotateNode newTail = tail;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        RotateNode newHead = newTail.next;
        newTail.next = null; // break circle

        return newHead;
    }
}
