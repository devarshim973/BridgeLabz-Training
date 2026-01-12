package com.day1.RemoveNthNodeEndList;

class RemoveNthFromEndSolution {

    public SingleListNode removeNthFromEnd(SingleListNode head, int n) {

        // Dummy node helps handle edge cases (like deleting head)
        SingleListNode dummy = new SingleListNode(0);
        dummy.next = head;

        SingleListNode fastPointer = dummy;
        SingleListNode slowPointer = dummy;

        // Step 1: Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fastPointer = fastPointer.next;
        }

        // Step 2: Move both pointers until fast reaches end
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        // Step 3: Remove nth node from end
        slowPointer.next = slowPointer.next.next;

        return dummy.next;
    }
}
