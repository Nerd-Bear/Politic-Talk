package com.java_team_project.politictalk.model.policy_suggestion;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@Document(collection = "policy_suggestion")
public class PolicySuggestion {
    @Id
    private String policySuggestionId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private ArrayList<String> committee;
    private ArrayList<String> agree;
    private ArrayList<String> disagree;
    private boolean didPolicianRead;
}

@Data
@Document(collection = "policy_suggestion_opinion")
class PolicySuggestionOpinion{
    @Id
    private String suggestPolicyOpinionId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String policySuggestionId;
}
