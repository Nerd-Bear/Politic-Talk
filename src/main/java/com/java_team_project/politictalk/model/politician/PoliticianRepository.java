package com.java_team_project.politictalk.model.politician;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PoliticianRepository extends MongoRepository<Politician, String> {
    List<Politician> findAllByRegion1AndPosition(String region1, String position);
}
