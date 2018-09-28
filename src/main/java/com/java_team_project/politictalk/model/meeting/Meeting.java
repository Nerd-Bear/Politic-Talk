package com.java_team_project.politictalk.model.meeting;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Data
@Document(collection = "meeting")
public class Meeting {
    @Id
    private String meetingId;
    private Date date;
    private int viewCount = 0;
    private ArrayList<String> participantId;
    private boolean didPoliticianRead;
    private String author;
    private String title;
    private String content;
    private String politicianId;
    private Date meetingDate;
    private String region;

    public void init(){
        this.meetingId = "a" + UUID.randomUUID().toString();
        this.date = new Date();
        this.viewCount = 0;
        this.participantId = new ArrayList<String>();
        this.didPoliticianRead = false;
    }
}
