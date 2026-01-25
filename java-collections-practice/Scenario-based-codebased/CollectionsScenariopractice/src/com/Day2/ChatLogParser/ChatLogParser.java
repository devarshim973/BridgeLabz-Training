package com.Day2.ChatLogParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatLogParser {

    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s(.*?):\\s(.*)");

    public Map<String, List<String>> parseChat(
            String filePath,
            MessageFilter<String> filter) throws Exception {

        Map<String, List<String>> chatMap = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = reader.readLine()) != null) {

            Matcher matcher = CHAT_PATTERN.matcher(line);

            if (matcher.matches()) {

                String time = matcher.group(1);
                String user = matcher.group(2);
                String message = matcher.group(3);

                if (!filter.allow(message)) {
                    continue; // skip idle chat
                }

                chatMap.putIfAbsent(user, new ArrayList<>());
                chatMap.get(user).add("[" + time + "] " + message);
            }
        }

        reader.close();
        return chatMap;
    }
}
