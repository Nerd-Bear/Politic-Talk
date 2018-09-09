package com.java_team_project.politictalk.model.meeting;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Document(collection = "meeting")
public class Meeting {
    @Id
    private String meetingId;
    private Date date = new Date();
    private int viewCount = 0;
    private ArrayList<String> participantId = new ArrayList<String>();
    private boolean didPoliticianRead = false;
    private String author;
    private String title;
    private String content;
    private String politicianId;
    private Date meetingDate;
    private String region;

    public String getMeetingId() {
        return meetingId;
    }

    public Date getDate() {
        return date;
    }

    public int getViewCount() {
        return viewCount;
    }

    public ArrayList<String> getParticipantId() {
        return participantId;
    }

    public boolean isDidPoliticianRead() {
        return didPoliticianRead;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
