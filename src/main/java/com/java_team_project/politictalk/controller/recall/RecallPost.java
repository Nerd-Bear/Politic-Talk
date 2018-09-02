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
public class RecallPost {
    @ApiOperation(value = "Post Discontent", notes = "Post Discontent")
    @RequestMapping(value = "/recall/discontent", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "Discontent Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Discontent Content", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "politicianId", value = "Politician Id", required = true, dataType = "string", paramType = "json")
    })

    public UUID postDiscontent() {
        /*
        불만 게시글을 DB에 저장하고 UUID를 리턴함
         */
        UUID discontentId = UUID.randomUUID();
        return discontentId;
    }

    @ApiOperation(value = "Get Discontent", notes = "Get Discontent")
    @RequestMapping(value = "/recall/discontent", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontent(@RequestParam UUID discontentId) {
        /*
        불만 게시글 id를 받아 DB에서 찾아서 게시글에 대한 내용을 리턴함
         */
        HashMap<String, Object> discontent = new HashMap<>();
        return discontent;
    }

    @ApiOperation(value = "Get Discontent List", notes = "Get Discontent List")
    @RequestMapping(value = "/recall/discontent/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontentList() {
        /*
        불만 게시글 목록을 리턴함
         */
        HashMap<String, Object> discontentList = new HashMap<>();
        return discontentList;
    }

    @ApiOperation(value = "Get Discontent List", notes = "Get Discontent List")
    @RequestMapping(value = "/recall/discontent/list/politician", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontentListByPoliticianId(@RequestParam String politicianId) {
        /*
        정치인 id를 받아 그 정치인에 대한 불만 게시글 목록을 리턴함
         */
        HashMap<String, Object> discontentList = new HashMap<>();
        return discontentList;
    }
}
