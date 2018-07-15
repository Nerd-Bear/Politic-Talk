package com.java_team_project.politictalk.model.account;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, Long>, AccountRepositoryCustom {
    Account findFirstById(String id);

    Account findById(String id);
}
