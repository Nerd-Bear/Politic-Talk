package com.java_team_project.politictalk.model.politician;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(collection = "politician")
public class Politician {
    private String name;
    private String position;
    private String region;
    private ArrayList<String> pledge;
    private String email;
    private String number;
}
