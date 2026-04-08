package com.m1;

import java.util.*;

public class example {

    static class ProjectTeam {
        String teamId;
        String section;
        String domain;
        String projectName;
        int projectScore;

        public ProjectTeam(String teamId, String section,
                           String domain, String projectName,
                           int projectScore) {
            this.teamId = teamId;
            this.section = section;
            this.domain = domain;
            this.projectName = projectName;
            this.projectScore = projectScore;
        }
    }

    static class CompetitionManager {

        private List<ProjectTeam> teamList = new ArrayList<>();

        public int registerTeam(String teamId, String section,
                                String domain, String projectName,
                                int projectScore) {

            for (ProjectTeam t : teamList) {
                if (t.teamId.equals(teamId)) {
                    return 0;
                }
            }

            teamList.add(new ProjectTeam(teamId, section, domain, projectName, projectScore));
            return 1;
        }

        public int reviseScore(String teamId, int projectScore) {

            for (ProjectTeam t : teamList) {
                if (t.teamId.equals(teamId)) {
                    t.projectScore = projectScore;
                    return 1;
                }
            }

            return 0;
        }

        public List<ProjectTeam> filterByDomain(String domain) {

            List<ProjectTeam> list = new ArrayList<>();

            for (ProjectTeam t : teamList) {
                if (t.domain.equals(domain)) {
                    list.add(t);
                }
            }

            return list;
        }

        public List<ProjectTeam> qualifyTeams(int cutoff) {

            List<ProjectTeam> list = new ArrayList<>();

            for (ProjectTeam t : teamList) {
                if (t.projectScore >= cutoff) {
                    list.add(t);
                }
            }

            return list;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        CompetitionManager cm = new CompetitionManager();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");

            String cmd = parts[0];

            if (cmd.equals("REGISTER")) {

                String teamId = parts[1];
                String section = parts[2];
                String domain = parts[3];
                String projectName = parts[4];
                int score = Integer.parseInt(parts[5]);

                cm.registerTeam(teamId, section, domain, projectName, score);

            } else if (cmd.equals("REVISE")) {

                String teamId = parts[1];
                int score = Integer.parseInt(parts[2]);

                int ok = cm.reviseScore(teamId, score);

                if (ok == 1) {
                    System.out.println("REVISED " + teamId + " " + score);
                } else {
                    System.out.println("team is not available");
                }

            } else if (cmd.equals("FILTERDOMAIN")) {

                String domain = parts[1];
                List<ProjectTeam> list = cm.filterByDomain(domain);

                if (list.isEmpty()) {
                    System.out.println("Team is not available for the domain: " + domain);
                } else {
                    for (ProjectTeam t : list) {
                        System.out.println(t.teamId + " " +
                                t.section + " " +
                                t.domain + " " +
                                t.projectName + " " +
                                t.projectScore);
                    }
                }

            } else if (cmd.equals("QUALIFY")) {

                int cutoff = Integer.parseInt(parts[1]);
                List<ProjectTeam> list = cm.qualifyTeams(cutoff);

                if (list.isEmpty()) {
                    System.out.println("No team qualified");
                } else {
                    for (ProjectTeam t : list) {
                        System.out.println(t.teamId + " " +
                                t.section + " " +
                                t.domain + " " +
                                t.projectName + " " +
                                t.projectScore);
                    }
                }
            }
        }

        sc.close();
    }
}