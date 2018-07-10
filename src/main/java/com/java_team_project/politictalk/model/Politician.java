package com.java_team_project.politictalk.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Politician {
    private String name;
    private String position;
    private String region;
    private ArrayList<String> pledge;
    private String email;
    private String number;
}
