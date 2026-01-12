package com.Day2.TextEditor;

import java.util.Stack;

class TextEditorManager {

    private String content;
    private Stack<TextEditorAction> undoStack;
    private Stack<TextEditorAction> redoStack;

    public TextEditorManager() {
        content = "";
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text
    public void insertText(String text) {

        content += text;
        undoStack.push(new TextEditorAction("INSERT", text));
        redoStack.clear(); // clear redo after new action

        System.out.println("Inserted: " + text);
    }

    // Delete text
    public void deleteText(int length) {

        if (length > content.length()) return;

        String deletedText =
                content.substring(content.length() - length);

        content =
                content.substring(0, content.length() - length);

        undoStack.push(new TextEditorAction("DELETE", deletedText));
        redoStack.clear();

        System.out.println("Deleted: " + deletedText);
    }

    // Undo last action
    public void undo() {

        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        TextEditorAction action = undoStack.pop();

        if (action.actionType.equals("INSERT")) {
            content =
                    content.substring(0,
                            content.length() - action.text.length());
        } else {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo performed");
    }

    // Redo last undone action
    public void redo() {

        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        TextEditorAction action = redoStack.pop();

        if (action.actionType.equals("INSERT")) {
            content += action.text;
        } else {
            content =
                    content.substring(0,
                            content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    public void displayContent() {
        System.out.println("Editor Content: " + content);
    }
}
