package com.java_team_project.politictalk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

@RestController
@Api(value = "Recall", tags = "주민 소환제")
public class Recall {
    @ApiOperation(value = "Get Politician List", notes = "정치인 목록 조회")
    @RequestMapping(value = "/recall/politician List", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getPoliticians(@RequestParam String region, @RequestParam String position){
        /*
        정치인 목록을 DB에서 끌어와 리스폰스 해줌
         */
        HashMap<String, Object> politicianList = new HashMap<>();
        return politicianList;
    }

    @ApiOperation(value = "Post Discontent", notes = "불만 게시글 작성")
    @RequestMapping(value = "/recall/discontent", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public UUID postDiscontent(){
        /*
        불만 게시글을 DB에 저장하고 UUID를 리턴함
         */
        UUID discontentId = UUID.randomUUID();
        return discontentId;
    }

    @ApiOperation(value = "Get Discontent", notes = "불만 게시글 조회")
    @RequestMapping(value = "/recall/discontent", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontent(@RequestParam UUID discontentId){
        /*
        불만 게시글 id를 받아 DB에서 찾아서 게시글에 대한 내용을 리턴함
         */
        HashMap<String, Object> discontent = new HashMap<>();
        return discontent;
    }

    @ApiOperation(value = "Get Discontent List", notes = "불만 게시글 목록 조회")
    @RequestMapping(value = "/recall/discontent_list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontentList(@RequestParam String politicianId){
        /*
        정치인 id를 받아 그 정치인에 대한 불만 게시글 목록을 리턴함
         */
        HashMap<String, Object> discontentList = new HashMap<>();
        return discontentList;
    }

    @ApiOperation(value = "Discontent Opinion", notes = "의견 및 증거 제시")
    @RequestMapping(value = "/recall/opinion", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public UUID discontentOpinion(){
        /*
        의견을 받고 의견을 DB에 등록 후 의견 uuid 를 리턴함
         */
        UUID opinionId = UUID.randomUUID();
        return opinionId;
    }

    @ApiOperation(value = "Vote Discontent", notes = "불만 게시글 찬성 및 반대")
    @RequestMapping(value = "/recall/vote", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void voteDiscontent(){
        /*
        찬성 및 반대 DB 저장
         */
    }
}
