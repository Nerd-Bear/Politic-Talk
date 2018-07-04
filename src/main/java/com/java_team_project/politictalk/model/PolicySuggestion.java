package com.java_team_project.politictalk.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

public class PolicySuggestion {
    @Id
    private String policySuggestionId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private ArrayList<String> committee;

    public String getPolicySuggestionId() {
        return policySuggestionId;
    }

    public void setPolicySuggestionId(String policySuggestionId) {
        this.policySuggestionId = policySuggestionId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public ArrayList<String> getCommittee() {
        return committee;
    }

    public void setCommittee(ArrayList<String> committee) {
        this.committee = committee;
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

    private ArrayList<String> agree;
    private ArrayList<String> disagree;
    private boolean didPolicianRead;
}

class PolicySuggestionOpinion{
    @Id
    private String suggestPolicyOpinionId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String policySuggestionId;

    public String getSuggestPolicyOpinionId() {
        return suggestPolicyOpinionId;
    }

    public void setSuggestPolicyOpinionId(String suggestPolicyOpinionId) {
        this.suggestPolicyOpinionId = suggestPolicyOpinionId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getPolicySuggestionId() {
        return policySuggestionId;
    }

    public void setPolicySuggestionId(String policySuggestionId) {
        this.policySuggestionId = policySuggestionId;
    }
}