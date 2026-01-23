package com.Day10.OnlineTicketBooking;

class EventBST {

    private EventNode root;

    // 🔹 Scenario 1: Insert Event
    public void insertEvent(int time, String name) {
        root = insert(root, time, name);
    }

    private EventNode insert(EventNode node, int time, String name) {
        if (node == null)
            return new EventNode(time, name);

        if (time < node.startTime)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        return node;
    }

    // 🔹 Scenario 2: Cancel Event
    public void cancelEvent(int time) {
        root = delete(root, time);
    }

    private EventNode delete(EventNode node, int time) {
        if (node == null)
            return null;

        if (time < node.startTime)
            node.left = delete(node.left, time);
        else if (time > node.startTime)
            node.right = delete(node.right, time);
        else {
            // one or no child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            // two children
            EventNode successor = minValue(node.right);
            node.startTime = successor.startTime;
            node.eventName = successor.eventName;
            node.right = delete(node.right, successor.startTime);
        }
        return node;
    }

    private EventNode minValue(EventNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // 🔹 Scenario 3: Show Events in Order
    public void showUpcomingEvents() {
        System.out.println("📅 Upcoming Events:");
        inorder(root);
    }

    private void inorder(EventNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println("Time: " + node.startTime + " | Event: " + node.eventName);
            inorder(node.right);
        }
    }
}
