package com.java_team_project.politictalk.controller.recall;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

@RestController
@Api(value = "Recall", tags = "Recall")
public class RecallOpinion {
    @ApiOperation(value = "Post Discontent Opinion", notes = "Add Discontent Opinion")
    @RequestMapping(value = "/recall/opinion", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "discontentId", value = "Discontent Id", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "title", value = "Discontent Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Discontent Content", required = true, dataType = "string", paramType = "json")
    })
    public UUID discontentOpinion() {
        /*
        의견을 받고 의견을 DB에 등록 후 의견 uuid 를 리턴함
         */
        UUID opinionId = UUID.randomUUID();
        return opinionId;
    }

    @ApiOperation(value = "Get Discontent Opinion", notes = "Get Discontent Opinion")
    @RequestMapping(value = "/recall/opinion", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontent(@RequestParam UUID discontentOpinionId) {
        /*
        의견id를 받아 DB에서 찾아서 게시글에 대한 내용을 리턴함
         */
        HashMap<String, Object> discontentOpinion = new HashMap<>();
        return discontentOpinion;
    }

    @ApiOperation(value = "Get Discontent Opinion List", notes = "Get Discontent Opinion List")
    @RequestMapping(value = "/recall/opinion/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontentList(@RequestParam String discontentId) {
        /*
        불만 리포트 id를 받아 그 불만 리포트에 대한 의견목록을 리턴함
         */
        HashMap<String, Object> discontentOpinionList = new HashMap<>();
        return discontentOpinionList;
    }
}
