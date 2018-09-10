package com.java_team_project.politictalk.model.recall;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecallRepository extends MongoRepository<Recall, String> {
}
