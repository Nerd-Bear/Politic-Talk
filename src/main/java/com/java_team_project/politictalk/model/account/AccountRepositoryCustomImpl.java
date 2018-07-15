package com.java_team_project.politictalk.model.account;

import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.Update;


public class AccountRepositoryCustomImpl implements AccountRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public int updateAccountPassword(String id, String password) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("password", password);

        UpdateResult result = mongoTemplate.updateFirst(query, update, Account.class);

        if (result != null)
            return result.getN();
        else
            return 0;
    }

    @Override
    public int updateAccountBirthDay(String id, String birthDay) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("birth_day", birthDay);

        UpdateResult result = mongoTemplate.updateMulti(query, update, Account.class);

        if (result != null)
            return result.getN();
        else
            return 0;
    }

    @Override
    public int updateAccountRegion(String id, String region) {
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("region", region);

        UpdateResult result = mongoTemplate.updateMulti(query, update, Account.class);

        if (result != null)
            return result.getN();
        else
            return 0;
    }

    @Override
    public int updateAccountEmail(String id, String email) {

        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("email", email);

        UpdateResult result = mongoTemplate.updateMulti(query, update, Account.class);

        if (result != null)
            return result.getN();
        else
            return 0;
    }
}
