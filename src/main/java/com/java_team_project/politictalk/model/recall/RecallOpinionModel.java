package com.java_team_project.politictalk.model.recall;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Data
@Document(collection = "recall_opinion")
public class RecallOpinionModel {
    @Id
    private String recallOpinionId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String recallId;

    public void init() {
        this.recallOpinionId = "a" + UUID.randomUUID().toString();
        this.date = new Date();
        this.viewCount = 0;
    }
}