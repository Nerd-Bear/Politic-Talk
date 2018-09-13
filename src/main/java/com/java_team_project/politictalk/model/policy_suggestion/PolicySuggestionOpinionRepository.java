package com.java_team_project.politictalk.model.policy_suggestion;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PolicySuggestionOpinionRepository extends MongoRepository<PolicySuggestionOpinion, String> {
    PolicySuggestionOpinion findBySuggestPolicyOpinionId(String suggestPolicyOpinionId);
    List<PolicySuggestionOpinion> findAllByPolicySuggestionId(String suggestPolicyId);
}
