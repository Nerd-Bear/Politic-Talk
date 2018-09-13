package com.java_team_project.politictalk.controller.suggest_policy;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.model.policy_suggestion.PolicySuggestion;
import com.java_team_project.politictalk.model.policy_suggestion.PolicySuggestionRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
public class SuggestPolicyPost {

    @Autowired
    PolicySuggestionRepository repository;

    @ApiOperation(value = "Suggest Policy", notes = "Suggest Policy")
    @RequestMapping(value = "/suggest_policy", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String postSuggestPolicy(@RequestBody @Valid PolicySuggestion policySuggestion) {

        policySuggestion.init();
        repository.save(policySuggestion);

        return policySuggestion.getPolicySuggestionId();
    }

    @ApiOperation(value = "Get Policy Suggestion List by Committee", notes = "Get Policy Suggestion List by Committee")
    @RequestMapping(value = "/suggest_policy/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<PolicySuggestion> getPolicySuggestionList(@RequestParam String committee) {

        List<PolicySuggestion> policySuggestions = repository.findAllByCommittee(committee);
        if(policySuggestions == null || policySuggestions.size() == 0){
            throw new NoContentException();
        }

        return policySuggestions;
    }

    @ApiOperation(value = "Get Policy Suggestion", notes = "Get Policy Suggestion")
    @RequestMapping(value = "/suggest_policy", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public PolicySuggestion getPolicySuggestion(@RequestParam String suggestPolicyId) {

        PolicySuggestion policySuggestion = repository.findByPolicySuggestionId(suggestPolicyId);
        if(policySuggestion == null){
            throw new NoContentException();
        }

        return policySuggestion;
    }

    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void noContentException(){

    }
}
