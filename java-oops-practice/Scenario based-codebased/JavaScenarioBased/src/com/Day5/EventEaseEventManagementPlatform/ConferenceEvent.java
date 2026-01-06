package com.Day5.EventEaseEventManagementPlatform;

public class ConferenceEvent extends BaseEvent {

    public ConferenceEvent(int eventId, String eventName, String location,
                           String date, int attendees,
                           boolean cateringIncluded) {

        super(eventId, eventName, location, date, attendees,
                50000,
                cateringIncluded ? 15000 : 0,
                5000);
    }

    @Override
    public void schedule() {
        System.out.println("🏢 Conference scheduled with professional setup.");
    }
}

