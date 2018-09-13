package com.java_team_project.politictalk.model.policy_suggestion;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PolicySuggestionRepository extends MongoRepository<PolicySuggestion, String> {
    List<PolicySuggestion> findAllByCommittee(String committee);
    PolicySuggestion findByPolicySuggestionId(String policySuggestionId);
}
