package com.Day2.MergekSortedLinkedLists;

public class MergeKListsApplication {

    public static void main(String[] args) {

        ListNodeElement list1 = LinkedListBuilder.createList(new int[]{1, 4, 5});
        ListNodeElement list2 = LinkedListBuilder.createList(new int[]{1, 3, 4});
        ListNodeElement list3 = LinkedListBuilder.createList(new int[]{2, 6});

        ListNodeElement[] lists = {list1, list2, list3};

        ListNodeElement mergedHead =
                KSortedListMerger.mergeKLists(lists);

        System.out.println("Merged Sorted List:");
        LinkedListBuilder.printList(mergedHead);
    }
}
