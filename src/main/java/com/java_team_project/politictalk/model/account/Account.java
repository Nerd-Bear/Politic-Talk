package com.java_team_project.politictalk.model.account;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "user")
public class Account {
    @Id
    private String userId;
    private String password;
    private String name;
    private Date birthDay;
    private String region;
    private String email;
}
