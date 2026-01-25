package com.Day2.ChatLogParser;

import java.util.*;

public class ChatLogParserApp {

    public static void main(String[] args) {

        List<String> idleWords = Arrays.asList("lol", "brb", "haha");

        MessageFilter<String> filter =
                new IdleChatFilter(idleWords);

        ChatLogParser parser = new ChatLogParser();

        try {
            Map<String, List<String>> result =
                    parser.parseChat("chatlog.txt", filter);

            System.out.println("=== Productive Chat Messages ===");

            result.forEach((user, messages) -> {
                System.out.println("\nUser: " + user);
                messages.forEach(System.out::println);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
