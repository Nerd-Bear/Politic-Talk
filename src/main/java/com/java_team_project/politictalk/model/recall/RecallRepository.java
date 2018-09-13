package com.java_team_project.politictalk.model.recall;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RecallRepository extends MongoRepository<Recall, String> {
    Recall findByRecallId(String recallId);

    List<Recall> findAllByPoliticianId(String politicianId);
}
