package com.java_team_project.politictalk.model.politician;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(collection = "politician")
public class Politician {
    private String name;
    private String vote_region;
    private String party;
    private String photo;
    private String sex;
    private String bityhDay;
    private String address;
    private String job;
    private String education;
    private ArrayList<String> career;
    private String region;
    private String position;
    private String votes;
    private String recommend;
}
