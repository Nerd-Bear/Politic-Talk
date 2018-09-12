package com.java_team_project.politictalk.json.request;

public class RecallVoteRequest {
    private String recallId;
    private String userId;

    public String getRecallId() {
        return recallId;
    }

    public void setRecallId(String recallId) {
        this.recallId = recallId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
