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
public class MeetingReview {
    @ApiOperation(value = "Review Meeting", notes = "Review Meeting")
    @RequestMapping(value = "/meeting/review", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title", value = "Meeting post Title", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "content", value = "Meeting post content", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "date", value = "Meeting date (form 'yyyy-mm-dd')", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "meetingId", value = "Meeting Id", required = true, dataType = "string", paramType = "json")
    })
    public UUID postMeetingReview() {
        /*
        미팅 후기 작성한 것을 DB에 저장 후 게시글의 id 리턴
         */
        UUID meetingReaviewId = UUID.randomUUID();
        return meetingReaviewId;
    }

    @ApiOperation(value = "Get Meeting Review List", notes = "Get Meeting Review List")
    @RequestMapping(value = "/meeting/review/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingReviewList(@RequestParam String politicianId) {
        /*
        해당 정치인과의 미팅 후기 리스트 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Meeting Review List by meeting id", notes = "Get Meeting Review List")
    @RequestMapping(value = "/meeting/review/list/meeting", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingReviewListByMeetingId(@RequestParam String meetingId) {
        /*
        해당 정치인과의 미팅 후기 리스트 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    @ApiOperation(value = "Get Meeting Review", notes = "Get Meeting Review")
    @RequestMapping(value = "/meeting/review", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getMeetingReview(@RequestParam String meetingRevuewId) {
        /*
        해당 정치인과의 미팅 후기 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }
}
