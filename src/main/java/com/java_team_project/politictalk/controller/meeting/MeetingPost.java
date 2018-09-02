package com.java_team_project.politictalk.controller.meeting;

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
public class MeetingPost {
    @ApiOperation(value = "Post Meeting", notes = "Post Meeting")
    @RequestMapping(value = "/meeting", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "Meeting post Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Meeting post content", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "date", value = "Meeting date (form 'yyyy-mm-dd')", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "maxNumber", value = "Max number of people", required = true, dataType = "int", paramType = "json")
    })
    public UUID postMeeting() {
        /*
        미팅 모집글 작성한 것을 DB에 저장 후 게시글의 id 리턴
         */
        UUID meetingId = UUID.randomUUID();
        return meetingId;
    }

    @ApiOperation(value = "Get Meeting ", notes = "Get Meeting")
    @RequestMapping(value = "/meeting", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeeting(@RequestParam String meetingId) {
        /*
        미팅 게시글 정보 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Meeting List", notes = "Get Meeting List")
    @RequestMapping(value = "/meeting/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingList() {
        /*
        미팅 리스트
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Meeting List by Politician Id", notes = "Get Meeting List")
    @RequestMapping(value = "/meeting/list/politician", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingListByPoliticianId(@RequestParam String politicianId) {
        /*
        국회의원별 미팅 리스트
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Meeting List by Region", notes = "Get Meeting List")
    @RequestMapping(value = "/meeting/list/region", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingListByRegion(@RequestParam String region) {
        /*
        지역별 미팅 리스트
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }
}
