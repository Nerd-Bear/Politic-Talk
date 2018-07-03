package com.java_team_project.politictalk.controller.recall;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Recall", tags = "Recall")
public class RecallVote {
    @ApiOperation(value = "Vote Discontent", notes = "Vote Discontent")
    @RequestMapping(value = "/recall/vote", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "discontentId", value = "Discontent Id", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "vote", value = "Agree(true) or Disagree(false)", required = true, dataType = "boolean", paramType = "json")
    })
    public void voteDiscontent() {
        /*
        찬성 및 반대 DB 저장
         */
    }
}
