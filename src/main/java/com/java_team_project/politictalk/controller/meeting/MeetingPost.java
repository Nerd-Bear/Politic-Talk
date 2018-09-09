package com.java_team_project.politictalk.controller.meeting;

import com.java_team_project.politictalk.exception.ExistIdException;
import com.java_team_project.politictalk.model.meeting.Meeting;
import com.java_team_project.politictalk.model.meeting.MeetingRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

@RestController
@Api(value = "Meeting", tags = "Meeting")
public class MeetingPost {
    @Autowired
    MeetingRepository meetingRepository;
    @ApiOperation(value = "Post Meeting", notes = "Post Meeting")
    @RequestMapping(value = "/meeting", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String postMeeting(@RequestBody final Meeting meeting) {
        if (meetingRepository.findByMeetingId(meeting.getMeetingId()) != null){
            throw new ExistIdException();
        }
        meetingRepository.save(meeting);
        return meeting.getMeetingId();
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

    @ExceptionHandler(ExistIdException.class)
    @ResponseStatus(HttpStatus.RESET_CONTENT)
    public void ExistMeetingId(){

    }
}
