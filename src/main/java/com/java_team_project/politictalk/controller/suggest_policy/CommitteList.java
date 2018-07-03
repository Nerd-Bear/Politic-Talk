package com.java_team_project.politictalk.controller.suggest_policy;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@Api(value = "SuggestPolicy", tags = "SuggestPolicy")
public class CommitteList {
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
}
