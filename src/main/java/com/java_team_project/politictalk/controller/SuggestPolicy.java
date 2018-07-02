package com.java_team_project.politictalk.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

@RestController
public class SuggestPolicy {

    @ApiOperation(value = "Get Committee List", notes = "Get Committee List")
    @RequestMapping(value = "/suggest_policy/committee", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getCommitteeList(){
        /*
        위원회 리스트 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

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
        미팅 모집글 작성한 것을 DB에 저장 후 게시글의 id 리턴
         */
        UUID suggestPolicyId = UUID.randomUUID();
        return suggestPolicyId;
    }

    @ApiOperation(value = "Get Policy Suggestion List", notes = "Get Policy Suggestion List")
    @RequestMapping(value = "/suggest_policy/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getPolicySuggestionList(@RequestParam String politicianId){
        /*
        정치인 아이디 기반으로 미팅 모집 글 목록 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Policy Suggestion", notes = "Get Policy Suggestion")
    @RequestMapping(value = "/suggest_policy", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getPolicySuggestion(@RequestParam String suggestPolicyId){
        /*
        미팅 모집 글 내용 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Policy Suggestion Opinion", notes = "Policy Suggest Opinion")
    @RequestMapping(value = "/suggest_Policy/opinion", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "suggestPolicyId", value = "Suggest PolicyId Id", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "title", value = "Discontent Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Discontent Content", required = true, dataType = "string", paramType = "json")
    })
    public UUID discontentOpinion(){
        /*
        의견을 받고 의견을 DB에 등록 후 의견 uuid 를 리턴함
         */
        UUID opinionId = UUID.randomUUID();
        return opinionId;
    }

    @ApiOperation(value = "Vote Policy Suggestion", notes = "Vote Policy Suggestion")
    @RequestMapping(value = "/suggest_policy/vote", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "suggestPolicyId", value = "SuggestPolicy Id", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "vote", value = "Agree(true) or Disagree(false)", required = true, dataType = "boolean", paramType = "json")
    })
    public void votePolicySuggestion(){
        /*
        찬성 및 반대 DB 저장
         */
    }
}
