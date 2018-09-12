package com.java_team_project.politictalk.model.recall;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RecallOpinionRepository extends MongoRepository<RecallOpinionModel, String> {
    RecallOpinionModel findByRecallOpinionId(String recallOpinionId);
    List<RecallOpinionModel> findAllByRecallId(String recallId);
}
