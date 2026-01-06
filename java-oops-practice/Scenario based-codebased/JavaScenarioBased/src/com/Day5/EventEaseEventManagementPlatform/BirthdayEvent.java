package com.Day5.EventEaseEventManagementPlatform;

public class BirthdayEvent extends BaseEvent {

    public BirthdayEvent(int eventId, String eventName, String location,
                         String date, int attendees,
                         boolean decorationIncluded) {

        super(eventId, eventName, location, date, attendees,
                20000,
                decorationIncluded ? 8000 : 0,
                2000);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday Party scheduled with fun activities!");
    }
}
