package com.StreamAPI.forEachMethod.EmailNotifications;

import java.util.*;

public class EmailNotificationSender {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
            "user1@gmail.com",
            "user2@yahoo.com",
            "user3@outlook.com"
        );

        // send notification to each email
        emails.forEach(email -> sendEmailNotification(email));
    }

    // mock method to send email
    private static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}
