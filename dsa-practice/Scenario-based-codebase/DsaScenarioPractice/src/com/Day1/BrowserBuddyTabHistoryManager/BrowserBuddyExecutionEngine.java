package com.Day1.BrowserBuddyTabHistoryManager;

class BrowserBuddyExecutionEngine {

    public static void main(String[] args) {

        BrowserTabHistory tab =
            new BrowserTabHistory("google.com");

        ClosedTabManager tabManager =
            new ClosedTabManager();

        tab.visitPage("github.com");
        tab.visitPage("stackoverflow.com");

        tab.goBack();
        tab.goBack();
        tab.goForward();

        tabManager.closeTab(tab.getCurrentPage());

        String reopenedTab = tabManager.reopenTab();
        if (reopenedTab != null) {
            System.out.println("Reopened tab: " + reopenedTab);
        }
    }
}
