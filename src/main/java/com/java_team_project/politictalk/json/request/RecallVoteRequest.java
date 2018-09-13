package com.java_team_project.politictalk.json.request;

import lombok.Data;

@Data
public class RecallVoteRequest {
    private String recallId;
    private String userId;
}
