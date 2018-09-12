package com.java_team_project.politictalk.model.recall;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

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

    public void init(){
        this.recallId = UUID.randomUUID().toString();
        this.date = new Date();
        this.viewCount = 0;
    }

    public String getRecallOpinionId() {
        return recallOpinionId;
    }

    public void setRecallOpinionId(String recallOpinionId) {
        this.recallOpinionId = recallOpinionId;
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

    public String getRecallId() {
        return recallId;
    }

    public void setRecallId(String recallId) {
        this.recallId = recallId;
    }
}