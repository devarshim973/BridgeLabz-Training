package com.Day2.TextEditor;

class TextEditorAction {

    String actionType;   // INSERT or DELETE
    String text;

    public TextEditorAction(String actionType, String text) {
        this.actionType = actionType;
        this.text = text;
    }
}
