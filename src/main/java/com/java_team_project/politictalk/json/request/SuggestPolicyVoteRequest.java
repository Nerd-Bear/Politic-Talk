package com.java_team_project.politictalk.json.request;

public class SuggestPolicyVoteRequest {
    private String policySuggestionId;
    private String userId;

    public String getPolicySuggestionId() {
        return policySuggestionId;
    }

    public void setPolicySuggestionId(String policySuggestionId) {
        this.policySuggestionId = policySuggestionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
