package com.java_team_project.politictalk.model.meeting;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Document(collection = "meeting")
public class Meeting {
    @Id
    private UUID meetingId = UUID.randomUUID();
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount = 0;
    private UUID politicianId;
    private Date meetingDate;
    private ArrayList<String> participantId = new ArrayList<String>();
    private boolean didPoliticianRead = false;
    private String region;

    public UUID getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(UUID meetingId) {
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

    public UUID getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(UUID politicianId) {
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

    public boolean isDidPoliticianRead() {
        return didPoliticianRead;
    }

    public void setDidPoliticianRead(boolean didPoliticianRead) {
        this.didPoliticianRead = didPoliticianRead;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
