package com.java_team_project.politictalk.controller.meeting;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Meeting", tags = "Meeting")
public class MeetingJoin {
    @ApiOperation(value = "Join Meeting", notes = "Join Meeting")
    @RequestMapping(value = "/meeting/join", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    public void joinMeeting(@RequestParam String meetingId) {
        /*
        미팅에 참가
         */
    }

    @ApiOperation(value = "Cancel Meeting Join", notes = "Cancel Meeting Join")
    @RequestMapping(value = "/meeting/join", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.CREATED)
    public void quitMeeting(@RequestParam String meetingId) {
        /*
        미팅 참가 취소
         */
    }
}
