package com.java_team_project.politictalk.model.policy_suggestion;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "policy_suggestion_opinion")
public class PolicySuggestionOpinion {
    @Id
    private String suggestPolicyOpinionId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String policySuggestionId;
}
