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
public class SuggestPolicyPost {
    @ApiOperation(value = "Suggest Policy", notes = "Suggest Policy")
    @RequestMapping(value = "/suggest_policy", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "Suggest Policy Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Suggest Policy Content", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "committee", value = "Committee to Suggest Policy", required = true, dataType = "string", paramType = "json")
    })
    public UUID postSuggestPolicy(){
        /*
        정책 제안글 작성한 것을 DB에 저장 후 게시글의 id 리턴
         */
        UUID suggestPolicyId = UUID.randomUUID();
        return suggestPolicyId;
    }

    @ApiOperation(value = "Get Policy Suggestion List", notes = "Get Policy Suggestion List")
    @RequestMapping(value = "/suggest_policy/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getPolicySuggestionList(@RequestParam String part){
        /*
        정책 제안 글 분야별로 목록 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Policy Suggestion", notes = "Get Policy Suggestion")
    @RequestMapping(value = "/suggest_policy", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getPolicySuggestion(@RequestParam String suggestPolicyId){
        /*
        정책 제안 글 내용 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }
}
