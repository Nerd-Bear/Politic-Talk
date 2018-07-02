package com.java_team_project.politictalk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

@RestController
@Api(value = "Meeting", tags = "Meeting")
public class meeting {

    @ApiOperation(value = "Get Schedule", notes = "Get Schedule")
    @RequestMapping(value = "/meeting/check_schedule", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getSchedule(@RequestParam String politicianId, @RequestParam int year, @RequestParam int month){
        /*
        정치인과 년도, 월 을 선택하면 해당 정치인이 해당 월에 무슨 스케쥴이 있고 언제 비어있는지 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Post Meeting", notes = "Post Meeting")
    @RequestMapping(value = "/meeting", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "Meeting post Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Meeting post content", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "date", value = "Meeting date (form 'yyyy-mm-dd')", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "maxNumber", value = "Max number of people", required = true, dataType = "int", paramType = "json")
    })
    public UUID postMeeting(){
        /*
        미팅 모집글 작성한 것을 DB에 저장 후 게시글의 id 리턴
         */
        UUID meetingId = UUID.randomUUID();
        return meetingId;
    }

    @ApiOperation(value = "Join Meeting", notes = "Join Meeting")
    @RequestMapping(value = "/meeting/join", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    public void joinMeeting(@RequestParam String meetingId){
        /*
        미팅에 참가
         */
    }

    @ApiOperation(value = "Cancel Meeting Join", notes = "Cancel Meeting Join")
    @RequestMapping(value = "/meeting/join", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.CREATED)
    public void quitMeeting(@RequestParam String meetingId){
        /*
        미팅 참가 취소
         */
    }

    @ApiOperation(value = "Get Meeting List by Politician Id", notes = "Get Meeting List")
    @RequestMapping(value = "/meeting/list/politician", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingListByPoliticianId(@RequestParam String politicianId){
        /*
        미팅 참가 취소
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Meeting List by Region", notes = "Get Meeting List")
    @RequestMapping(value = "/meeting/list/region", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingListByRegion(@RequestParam String region){
        /*
        미팅 참가 취소
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Review Meeting", notes = "Review Meeting")
    @RequestMapping(value = "/meeting/review", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "Meeting post Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Meeting post content", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "date", value = "Meeting date (form 'yyyy-mm-dd')", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "meetingId", value = "Meeting Id", required = true, dataType = "string", paramType = "json")
    })
    public UUID postMeetingReview(){
        /*
        미팅 모집글 작성한 것을 DB에 저장 후 게시글의 id 리턴
         */
        UUID meetingReaviewId = UUID.randomUUID();
        return meetingReaviewId;
    }

    @ApiOperation(value = "Get Meeting Review List", notes = "Get Meeting Review List")
    @RequestMapping(value = "/meeting/review/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingReviewList(@RequestParam String politicianId){
        /*
        해당 정치인과의 미팅 후기 리스트 반환
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Meeting Review", notes = "Get Meeting Review")
    @RequestMapping(value = "/meeting/review", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingReview(@RequestParam String meetingRevuewId){
        /*
        해당 정치인과의 미팅 후기 리스트 반환
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }
}
