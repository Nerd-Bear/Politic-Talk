package com.java_team_project.politictalk.model.politician;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PoliticianRepository extends MongoRepository<Politician, String> {
    List<Politician> findAllByRegionAndPosition(String region, String position);

    List<Politician> findAllByRegionAndPositionAndName(String region, String position, String name);
}
