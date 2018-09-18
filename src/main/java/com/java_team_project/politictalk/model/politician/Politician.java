package com.java_team_project.politictalk.model.politician;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(collection = "politician")
public class Politician {
    @Id
    private String politicianId;
    private String name;
    private String party;
    private String photo;
    private String sex;
    private String birthDay;
    private String address;
    private String job;
    private String education;
    private ArrayList<String> career;
    private String region;
    private String position;
    private String votes;
    private String recommend;
}
