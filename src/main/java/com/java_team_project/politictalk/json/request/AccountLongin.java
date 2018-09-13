package com.java_team_project.politictalk.json.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class AccountLongin {
    @NotNull
    @Size(max = 64)
    private String id;

    @NotNull
    @Size(max = 64)
    private String password;
}
