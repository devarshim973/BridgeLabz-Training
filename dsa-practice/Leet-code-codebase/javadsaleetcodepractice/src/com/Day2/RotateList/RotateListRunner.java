package com.Day2.RotateList;

public class RotateListRunner {

    public static void main(String[] args) {

        RotateNode head =
                RotateListHelper.createList(new int[]{1, 2, 3, 4, 5});

        RotateNode result =
                RightRotationService.rotateRight(head, 2);

        System.out.println("Rotated List:");
        RotateListHelper.printList(result);
    }
}
