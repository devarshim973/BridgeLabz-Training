package com.Day1.ResumeAnalyzer;

import java.util.List;

public class ResumeCandidateData {
    private String name;
    private String email;
    private String phone;
    private List<String> matchedSkills;

    public ResumeCandidateData(String name, String email, String phone, List<String> matchedSkills) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.matchedSkills = matchedSkills;
    }

    public String getEmail() {
        return email;
    }

    public int getSkillMatchCount() {
        return matchedSkills.size();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone: " + phone +
                ", Skills Matched: " + matchedSkills;
    }
}
