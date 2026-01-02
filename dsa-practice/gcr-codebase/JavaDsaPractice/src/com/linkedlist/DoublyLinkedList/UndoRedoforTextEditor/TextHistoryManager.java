package com.linkedlist.DoublyLinkedList.UndoRedoforTextEditor;

public class TextHistoryManager {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int MAX_HISTORY = 10;

    public TextHistoryManager() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    // Add new text state
    public void addState(String newText) {
        TextStateNode newNode = new TextStateNode(newText);

        // If undo was used, remove forward history
        if (current != null && current.next != null) {
            removeForwardStates(current.next);
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("No text available");
        }
    }

    // Remove forward history after undo
    private void removeForwardStates(TextStateNode node) {
        while (node != null) {
            size--;
            node = node.next;
        }
        current.next = null;
        tail = current;
    }
}
