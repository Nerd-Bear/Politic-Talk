package com.java_team_project.politictalk.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

public class Meeting {
    @Id
    private String meetingId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String politicianId;
    private Date meetingDate;
    private ArrayList<String> participantId;
    private boolean didPolicianRead;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
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

    public String getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(String politicianId) {
        this.politicianId = politicianId;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public ArrayList<String> getParticipantId() {
        return participantId;
    }

    public void setParticipantId(ArrayList<String> participantId) {
        this.participantId = participantId;
    }

    public boolean isDidPolicianRead() {
        return didPolicianRead;
    }

    public void setDidPolicianRead(boolean didPolicianRead) {
        this.didPolicianRead = didPolicianRead;
    }
}

class MeetingReview {
    @Id
    private String meetingReviewId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String meetingId;
    private String politicianId;

    public String getMeetingReviewId() {
        return meetingReviewId;
    }

    public void setMeetingReviewId(String meetingReviewId) {
        this.meetingReviewId = meetingReviewId;
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

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(String politicianId) {
        this.politicianId = politicianId;
    }
}
