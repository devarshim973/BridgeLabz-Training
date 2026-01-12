package com.Day2.TextEditor;

class TextEditorExecutionEngine {

    public static void main(String[] args) {

        TextEditorManager editor =
                new TextEditorManager();

        editor.insertText("Hello ");
        editor.insertText("World");

        editor.displayContent();

        editor.deleteText(5);
        editor.displayContent();

        editor.undo();
        editor.displayContent();

        editor.redo();
        editor.displayContent();
    }
}
