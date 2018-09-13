package com.java_team_project.politictalk.model.policy_suggestion;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Data
@Document(collection = "policy_suggestion")
public class PolicySuggestion {
    @Id
    private String policySuggestionId;
    private ArrayList<String> agree;
    private ArrayList<String> disagree;
    private boolean didPolicianRead;
    private Date date;
    private int viewCount;

    private String committee;
    private String author;
    private String title;
    private String content;

    public void init() {
        this.policySuggestionId = UUID.randomUUID().toString();
        this.agree = new ArrayList<String>();
        this.agree = new ArrayList<String>();
        this.didPolicianRead = false;
        this.date = new Date();
        this.viewCount = 0;
    }
}
