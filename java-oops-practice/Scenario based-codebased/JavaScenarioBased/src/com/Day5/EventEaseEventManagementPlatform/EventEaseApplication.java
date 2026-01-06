package com.Day5.EventEaseEventManagementPlatform;

public class EventEaseApplication {

    public static void main(String[] args) {

        EventUser organizer = new EventUser("Amit Sharma", "amit@gmail.com");

        BaseEvent birthday = new BirthdayEvent(
                101,
                "Riya's Birthday",
                "Banquet Hall",
                "15-03-2026",
                50,
                true
        );

        BaseEvent conference = new ConferenceEvent(
                102,
                "Tech Conference",
                "Convention Center",
                "20-04-2026",
                200,
                true
        );

        System.out.println("Organizer: " + organizer.getUserName());
        System.out.println();

        birthday.schedule();
        birthday.showEventDetails();

        System.out.println();

        conference.schedule();
        conference.showEventDetails();
    }
}
