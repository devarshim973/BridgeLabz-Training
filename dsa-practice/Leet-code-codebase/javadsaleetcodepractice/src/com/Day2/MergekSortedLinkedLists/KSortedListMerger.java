package com.Day2.MergekSortedLinkedLists;

import java.util.PriorityQueue;

public class KSortedListMerger {

    public static ListNodeElement mergeKLists(ListNodeElement[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNodeElement> minHeap =
                new PriorityQueue<>((a, b) -> a.value - b.value);

        // Add head of each list
        for (ListNodeElement node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        ListNodeElement dummyHead = new ListNodeElement(0);
        ListNodeElement current = dummyHead;

        while (!minHeap.isEmpty()) {
            ListNodeElement smallest = minHeap.poll();
            current.next = smallest;
            current = current.next;

            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummyHead.next;
    }
}
