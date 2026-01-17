package com.Collections.DesignVotingSystem;

public class CandidateVoteRecord {

    private String candidateName;

    public CandidateVoteRecord(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    @Override
    public String toString() {
        return candidateName;
    }
}
