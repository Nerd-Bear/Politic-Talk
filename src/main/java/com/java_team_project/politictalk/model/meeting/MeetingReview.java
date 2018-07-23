package com.java_team_project.politictalk.model.meeting;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "meeting_review")
public class MeetingReview {
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
