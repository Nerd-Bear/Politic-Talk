package com.java_team_project.politictalk.model.policy_suggestion;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

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

    public void init(){
        this.policySuggestionId = UUID.randomUUID().toString();
        this.agree = new ArrayList<String>();
        this.agree = new ArrayList<String>();
        this.didPolicianRead = false;
        this.date = new Date();
        this.viewCount = 0;
    }

    public String getPolicySuggestionId() {
        return policySuggestionId;
    }

    public void setPolicySuggestionId(String policySuggestionId) {
        this.policySuggestionId = policySuggestionId;
    }

    public ArrayList<String> getAgree() {
        return agree;
    }

    public void setAgree(ArrayList<String> agree) {
        this.agree = agree;
    }

    public ArrayList<String> getDisagree() {
        return disagree;
    }

    public void setDisagree(ArrayList<String> disagree) {
        this.disagree = disagree;
    }

    public boolean isDidPolicianRead() {
        return didPolicianRead;
    }

    public void setDidPolicianRead(boolean didPolicianRead) {
        this.didPolicianRead = didPolicianRead;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
