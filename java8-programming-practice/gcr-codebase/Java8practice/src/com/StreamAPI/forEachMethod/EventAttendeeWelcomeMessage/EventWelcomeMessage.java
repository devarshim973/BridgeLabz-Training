package com.StreamAPI.forEachMethod.EventAttendeeWelcomeMessage;

import java.util.*;

public class EventWelcomeMessage {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Amit",
            "Neha",
            "Rahul",
            "Pooja"
        );

        // print welcome message for each attendee
        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
