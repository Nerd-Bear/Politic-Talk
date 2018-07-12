package com.java_team_project.politictalk.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String password;
    private String name;
    private String birthDay;
    private String region;
    private String email;
}
