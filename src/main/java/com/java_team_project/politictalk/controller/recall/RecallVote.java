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
    @ApiOperation(value = "Approve Discontent", notes = "Vote Discontent")
    @RequestMapping(value = "/recall/vote", method = RequestMethod.PATCH)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "discontentId", value = "Discontent Id", required = true, dataType = "string", paramType = "json")
    })
    public void approveDiscontent() {
        /*
        불만 게시글 찬성 DB 저장
         */
    }

    @ApiOperation(value = "Disapprove Discontent", notes = "Vote Discontent")
    @RequestMapping(value = "/recall/vote", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "discontentId", value = "Discontent Id", required = true, dataType = "string", paramType = "json")
    })
    public void disapproveDiscontent() {
        /*
        불만 게시글 반대 db 저장
         */
    }
}
