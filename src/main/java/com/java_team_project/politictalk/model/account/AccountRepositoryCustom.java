package com.java_team_project.politictalk.model.account;

public interface AccountRepositoryCustom {

    int updateAccountPassword(String id, String password);
    int updateAccountBirthDay(String id, String password);
    int updateAccountRegion(String id, String region);
    int updateAccountEmail(String Id, String email);

}

