package com.java_team_project.politictalk.controller.suggest_policy;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.json.request.SuggestPolicyVoteRequest;
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
import java.util.List;

@RestController
@Api(value = "SuggestPolicy", tags = "SuggestPolicy")
public class SuggestPolicyVote {

    @Autowired
    PolicySuggestionRepository repository;

    @ApiOperation(value = "Approve Policy Suggestion", notes = "Vote Policy Suggestion")
    @RequestMapping(value = "/suggest_policy/vote", method = RequestMethod.PATCH)
    @ResponseStatus(HttpStatus.CREATED)
    public void approvePolicySuggestion(@RequestBody @Valid SuggestPolicyVoteRequest suggestPolicyVoteRequest) {

        PolicySuggestion policySuggestion = repository.findByPolicySuggestionId(suggestPolicyVoteRequest.getPolicySuggestionId());
        if(policySuggestion == null){
            throw new NoContentException();
        }

        List<String> approve = policySuggestion.getAgree();

        String user = suggestPolicyVoteRequest.getUserId();
        if(approve.contains(user))
            approve.remove(user);
        else
            approve.add(user);
        repository.save(policySuggestion);
    }

    @ApiOperation(value = "Dispprove Policy Suggestion", notes = "Vote Policy Suggestion")
    @RequestMapping(value = "/suggest_policy/vote", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "suggestPolicyId", value = "SuggestPolicy Id", required = true, dataType = "string", paramType = "json")
    })
    public void disapprovePolicySuggestion(@RequestBody @Valid SuggestPolicyVoteRequest suggestPolicyVoteRequest) {

        PolicySuggestion policySuggestion = repository.findByPolicySuggestionId(suggestPolicyVoteRequest.getPolicySuggestionId());
        if(policySuggestion == null){
            throw new NoContentException();
        }

        List<String> disApprove = policySuggestion.getDisagree();

        String user = suggestPolicyVoteRequest.getUserId();
        if(disApprove.contains(user))
            disApprove.remove(user);
        else
            disApprove.add(user);
        repository.save(policySuggestion);
    }
}
