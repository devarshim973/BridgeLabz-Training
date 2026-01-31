package com.StreamAPI.StreamAPI.FilteringExpiringMemberships;

import java.time.LocalDate;
import java.util.*;

public class ExpiringMembershipFilter {

    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
            new GymMember("Rahul", LocalDate.now().plusDays(10)),
            new GymMember("Amit", LocalDate.now().plusDays(45)),
            new GymMember("Neha", LocalDate.now().plusDays(25)),
            new GymMember("Pooja", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()

            // filter members expiring within next 30 days
            .filter(member ->
                !member.getExpiryDate().isBefore(today) &&
                !member.getExpiryDate().isAfter(next30Days)
            )

            // print result
            .forEach(System.out::println);
    }
}
