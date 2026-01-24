package com.Day1.ResumeAnalyzer;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class ResumeAnalyzerSystem {

    private static final List<String> KEYWORDS = Arrays.asList("Java", "Python", "Spring");
    private Map<String, ResumeCandidateData> candidatesMap = new HashMap<>();

    public void processResumes(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("No files found in the folder!");
            return;
        }

        for (File file : files) {
            try {
                if (!file.getName().endsWith(".txt")) {
                    throw new InvalidResumeFormatException("Unsupported file format: " + file.getName());
                }

                String content = readTextFile(file);
                String email = extractEmail(content);
                String phone = extractPhone(content);
                String name = extractName(content);
                List<String> matchedSkills = extractSkills(content);

                ResumeCandidateData candidate = new ResumeCandidateData(name, email, phone, matchedSkills);
                candidatesMap.put(email, candidate);

            } catch (InvalidResumeFormatException | IOException | NoSuchElementException e) {
                System.out.println("Skipping file " + file.getName() + ": " + e.getMessage());
            }
        }
    }

    private String readTextFile(File file) throws IOException {
        return new String(Files.readAllBytes(file.toPath()));
    }

    private String extractEmail(String content) {
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}");
        Matcher matcher = emailPattern.matcher(content);
        if (matcher.find()) return matcher.group();
        throw new NoSuchElementException("Email not found!");
    }

    private String extractPhone(String content) {
        Pattern phonePattern = Pattern.compile("\\b\\d{10}\\b");
        Matcher matcher = phonePattern.matcher(content);
        if (matcher.find()) return matcher.group();
        throw new NoSuchElementException("Phone not found!");
    }

    private String extractName(String content) {
        // Simple example: first line as name
        String[] lines = content.split("\n");
        if (lines.length > 0) return lines[0].trim();
        return "Unknown";
    }

    private List<String> extractSkills(String content) {
        List<String> matchedSkills = new ArrayList<>();
        for (String keyword : KEYWORDS) {
            Pattern pattern = Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(content);
            if (matcher.find()) matchedSkills.add(keyword);
        }
        return matchedSkills;
    }

    public void printSortedCandidates() {
        List<ResumeCandidateData> sortedList = candidatesMap.values().stream()
                .sorted((a, b) -> b.getSkillMatchCount() - a.getSkillMatchCount())
                .collect(Collectors.toList());

        for (ResumeCandidateData candidate : sortedList) {
            System.out.println(candidate);
        }
    }

    public static void main(String[] args) {
        ResumeAnalyzerSystem analyzer = new ResumeAnalyzerSystem();
        analyzer.processResumes("resumes"); // Folder path
        analyzer.printSortedCandidates();
    }
}

// Custom Exception
class InvalidResumeFormatException extends Exception {
    public InvalidResumeFormatException(String message) {
        super(message);
    }
}
