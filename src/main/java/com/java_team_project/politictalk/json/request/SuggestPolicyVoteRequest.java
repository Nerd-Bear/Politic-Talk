package com.java_team_project.politictalk.json.request;

import lombok.Data;

@Data
public class SuggestPolicyVoteRequest {
    private String policySuggestionId;
    private String userId;
}
