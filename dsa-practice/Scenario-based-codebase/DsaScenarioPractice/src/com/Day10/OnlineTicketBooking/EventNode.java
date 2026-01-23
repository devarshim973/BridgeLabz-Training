package com.Day10.OnlineTicketBooking;

class EventNode {
    int startTime;        // event start time
    String eventName;
    EventNode left, right;

    EventNode(int startTime, String eventName) {
        this.startTime = startTime;
        this.eventName = eventName;
        left = right = null;
    }
}
