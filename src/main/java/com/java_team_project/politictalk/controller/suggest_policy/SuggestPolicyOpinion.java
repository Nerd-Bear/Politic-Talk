package com.java_team_project.politictalk.controller.suggest_policy;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

@RestController
@Api(value = "SuggestPolicy", tags = "SuggestPolicy")
public class SuggestPolicyOpinion {
    @ApiOperation(value = "Policy Suggestion Opinion", notes = "Add Policy Suggestion Opinion")
    @RequestMapping(value = "/suggest_policy/opinion", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "suggestPolicyId", value = "Suggest Policy Id", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "title", value = "Policy Suggestion Opinion Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Policy Suggestion Opinion Content", required = true, dataType = "string", paramType = "json")
    })
    public UUID policySuggestOpinion() {
        /*
        의견을 받고 의견을 DB에 등록 후 의견 uuid 를 리턴함
         */
        UUID opinionId = UUID.randomUUID();
        return opinionId;
    }

    @ApiOperation(value = "Get Policy Suggestion Opinion", notes = "Get Policy Suggestion Opinion")
    @RequestMapping(value = "/suggest_policy/opinion", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getPolicySuggestOpinion(@RequestParam UUID suggestPolicyOpinionId) {
        /*
        의견id를 받아 DB에서 찾아서 게시글에 대한 내용을 리턴함
         */
        HashMap<String, Object> suggestPolicyOpinion = new HashMap<>();
        return suggestPolicyOpinion;
    }

    @ApiOperation(value = "Get Policy Suggestion Opinion List", notes = "Get Policy Suggestion Opinion List")
    @RequestMapping(value = "/suggest_policy/opinion/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getSuggestPolicyList(@RequestParam String suggestPolicyId) {
        /*
        정책 제안id를 받아 그 정책 제안에 대한 의견목록을 리턴함
         */
        HashMap<String, Object> suggestPolicyOpinion = new HashMap<>();
        return suggestPolicyOpinion;
    }
}
