package com.java_team_project.politictalk.json;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AccountLongin {
    @NotNull
    @Size(max = 64)
    private String id;

    @NotNull
    @Size(max = 64)
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}