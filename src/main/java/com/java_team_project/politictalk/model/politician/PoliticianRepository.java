package com.java_team_project.politictalk.model.politician;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PoliticianRepository extends MongoRepository<Politician, String> {
    List<Politician> findAllByRegionContaining(String region);

    List<Politician> findAllByRegionContainingAndPosition(String region, String position);

    List<Politician> findAllByRegionContainingAndName(String region, String name);

    List<Politician> findAllByRegionContainingAndPositionAndName(String region, String position, String name);

    Politician findByPoliticianId(String politicianId);
}
