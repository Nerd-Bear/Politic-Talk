package com.java_team_project.politictalk.controller.suggest_policy;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.model.policy_suggestion.PolicySuggestionOpinion;
import com.java_team_project.politictalk.model.policy_suggestion.PolicySuggestionOpinionRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@RestController
@Api(value = "SuggestPolicy", tags = "SuggestPolicy")
public class SuggestPolicyOpinion {

    @Autowired
    PolicySuggestionOpinionRepository repository;

    @ApiOperation(value = "Policy Suggestion Opinion", notes = "Add Policy Suggestion Opinion")
    @RequestMapping(value = "/suggest_policy/opinion", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String policySuggestOpinion(@RequestBody @Valid PolicySuggestionOpinion policySuggestionOpinion) {

        repository.save(policySuggestionOpinion);
        return policySuggestionOpinion.getSuggestPolicyOpinionId();
    }

    @ApiOperation(value = "Get Policy Suggestion Opinion", notes = "Get Policy Suggestion Opinion")
    @RequestMapping(value = "/suggest_policy/opinion", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public PolicySuggestionOpinion getPolicySuggestOpinion(@RequestParam String suggestPolicyOpinionId) {

        PolicySuggestionOpinion policySuggestionOpinion = repository.findBySuggestPolicyOpinionId(suggestPolicyOpinionId);
        if(policySuggestionOpinion == null){
            throw new NoContentException();
        }

        return policySuggestionOpinion;
    }

    @ApiOperation(value = "Get Policy Suggestion Opinion List", notes = "Get Policy Suggestion Opinion List")
    @RequestMapping(value = "/suggest_policy/opinion/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<PolicySuggestionOpinion> getSuggestPolicyList(@RequestParam String suggestPolicyId) {

        List<PolicySuggestionOpinion> policySuggestionOpinions = repository.findAllByPolicySuggestionId(suggestPolicyId);

        if(policySuggestionOpinions == null || policySuggestionOpinions.size() == 0){
            throw new NoContentException();
        }

        return policySuggestionOpinions;
    }

    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void noContentException(){

    }
}
