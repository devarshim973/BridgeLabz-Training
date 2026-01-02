package com.linkedlist.DoublyLinkedList.UndoRedoforTextEditor;

public class TextStateNode {

    String content;
    TextStateNode next;
    TextStateNode prev;

    public TextStateNode(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}
