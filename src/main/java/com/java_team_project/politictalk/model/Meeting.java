package com.java_team_project.politictalk.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@Document(collection = "meeting")
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
}

@Data
@Document(collection = "meeting_review")
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
}
