package com.Day5.EventEaseEventManagementPlatform;

public interface EventSchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
