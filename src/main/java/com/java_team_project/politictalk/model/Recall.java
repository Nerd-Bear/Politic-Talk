package com.java_team_project.politictalk.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Recall {
    @Id
    private String recallId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String politicianId;
}

@Data
class RecallOpinion {
    @Id
    private String recallOpinionId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String recallId;
}