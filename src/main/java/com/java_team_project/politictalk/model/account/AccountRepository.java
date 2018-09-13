package com.java_team_project.politictalk.model.account;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
    Account findByUserId(String Userid);

    Account findByEmail(String email);
}
