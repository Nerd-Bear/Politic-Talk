package com.java_team_project.politictalk.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private String id;
    private String password;
    private String name;
    private String birthDay;
    private String region;
    private String email;
}
