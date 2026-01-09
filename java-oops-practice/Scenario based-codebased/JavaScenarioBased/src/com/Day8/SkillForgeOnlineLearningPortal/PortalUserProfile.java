package com.Day8.SkillForgeOnlineLearningPortal;

abstract class PortalUserProfile {

    private String name;
    private String email;

    protected PortalUserProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}
