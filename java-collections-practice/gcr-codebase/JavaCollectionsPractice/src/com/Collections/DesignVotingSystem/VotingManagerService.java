package com.Collections.DesignVotingSystem;

import java.util.*;

public class VotingManagerService {

    // HashMap: Quick vote count
    private Map<String, Integer> voteMap = new HashMap<>();

    // LinkedHashMap: Maintain insertion order of candidates
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>();

    // TreeMap: Sorted display of results
    private Map<String, Integer> sortedVoteMap = new TreeMap<>();

    // Add a vote for a candidate
    public void vote(String candidate) {
        // Update HashMap
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

        // Update LinkedHashMap (maintain insertion order)
        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);

        // Update TreeMap (sorted by candidate name)
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    // Display HashMap votes (quick lookup)
    public void displayHashMapVotes() {
        System.out.println("Votes in HashMap (unordered): " + voteMap);
    }

    // Display LinkedHashMap votes (insertion order)
    public void displayLinkedHashMapVotes() {
        System.out.println("Votes in LinkedHashMap (insertion order): " + voteOrderMap);
    }

    // Display TreeMap votes (sorted order)
    public void displayTreeMapVotes() {
        System.out.println("Votes in TreeMap (sorted): " + sortedVoteMap);
    }
}
