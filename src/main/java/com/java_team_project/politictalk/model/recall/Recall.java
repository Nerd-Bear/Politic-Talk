package com.java_team_project.politictalk.model.recall;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Data
@Document(collection = "recall")
public class Recall {
    @Id
    private String recallId;
    private String author;
    private Date date;
    private String title;
    private String content;
    private int viewCount;
    private String politicianId;
    private ArrayList<String> approve;
    private ArrayList<String> disApprove;

    public void init() {
        this.recallId = "a" + UUID.randomUUID().toString();
        this.date = new Date();
        this.viewCount = 0;

        this.approve = new ArrayList<String>();
        this.disApprove = new ArrayList<String>();
    }
}