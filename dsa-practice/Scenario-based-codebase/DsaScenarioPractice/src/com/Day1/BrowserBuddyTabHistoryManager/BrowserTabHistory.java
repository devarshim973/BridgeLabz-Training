package com.Day1.BrowserBuddyTabHistoryManager;

class BrowserTabHistory {

    private BrowserHistoryNode current;

    public BrowserTabHistory(String homepage) {
        current = new BrowserHistoryNode(homepage);
    }

    // Visit a new page
    public void visitPage(String url) {

        BrowserHistoryNode newNode = new BrowserHistoryNode(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;

        System.out.println("Visited: " + url);
    }

    // Move backward
    public void goBack() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    // Move forward
    public void goForward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page");
        }
    }

    public String getCurrentPage() {
        return current.url;
    }
}
