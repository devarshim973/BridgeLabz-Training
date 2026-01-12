package com.day1.MergeTwoSortedLists;

class MergeSortedListsSolution {

    public SortedListNode mergeTwoLists(
            SortedListNode list1,
            SortedListNode list2) {

        // Dummy node simplifies merging logic
        SortedListNode dummy =
                new SortedListNode(-1);

        SortedListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {

            if (list1.value <= list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
