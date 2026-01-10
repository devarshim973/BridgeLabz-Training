package com.Day1.BrowserBuddyTabHistoryManager;

class BrowserHistoryNode {

    String url;
    BrowserHistoryNode prev;
    BrowserHistoryNode next;

    public BrowserHistoryNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
