package com.Collections.DesignVotingSystem;

public class VotingSystemApplication {

    public static void main(String[] args) {

        VotingManagerService votingManager = new VotingManagerService();

        // Voting
        votingManager.vote("Alice");
        votingManager.vote("Bob");
        votingManager.vote("Alice");
        votingManager.vote("Carol");
        votingManager.vote("Bob");
        votingManager.vote("Dave");
        votingManager.vote("Alice");

        // Display votes in different maps
        votingManager.displayHashMapVotes();
        votingManager.displayLinkedHashMapVotes();
        votingManager.displayTreeMapVotes();
    }
}
