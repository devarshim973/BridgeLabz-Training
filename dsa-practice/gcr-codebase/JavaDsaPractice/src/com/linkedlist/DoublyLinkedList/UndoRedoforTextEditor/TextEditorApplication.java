package com.linkedlist.DoublyLinkedList.UndoRedoforTextEditor;

public class TextEditorApplication {

    public static void main(String[] args) {

        TextHistoryManager editor = new TextHistoryManager();

        editor.addState("Hello");
        editor.displayCurrentState();

        editor.addState("Hello World");
        editor.displayCurrentState();

        editor.addState("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Java");
        editor.displayCurrentState();

        editor.redo(); // should fail
    }
}
