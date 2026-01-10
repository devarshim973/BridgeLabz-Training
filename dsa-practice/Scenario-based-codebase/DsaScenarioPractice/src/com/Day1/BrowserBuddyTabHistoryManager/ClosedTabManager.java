package com.Day1.BrowserBuddyTabHistoryManager;

import java.util.Stack;

class ClosedTabManager {

    private Stack<String> closedTabs;

    public ClosedTabManager() {
        closedTabs = new Stack<>();
    }

    public void closeTab(String currentPage) {
        closedTabs.push(currentPage);
        System.out.println("Tab closed: " + currentPage);
    }

    public String reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to reopen");
            return null;
        }
        return closedTabs.pop();
    }
}
