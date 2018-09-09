package com.java_team_project.politictalk.controller.meeting;

import com.java_team_project.politictalk.exception.ExistIdException;
import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.model.meeting.Meeting;
import com.java_team_project.politictalk.model.meeting.MeetingRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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
    public Meeting getMeeting(@RequestParam String meetingId) {

        Meeting meeting = meetingRepository.findByMeetingId(meetingId);
        if(meeting == null){
            throw new NoContentException();
        }

        return meeting;
    }

    @ApiOperation(value = "Get Meeting List", notes = "Get Meeting List")
    @RequestMapping(value = "/meeting/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Meeting> getMeetingList() {

        List<Meeting> meetings = meetingRepository.findAll();
        if(meetings == null || meetings.size() == 0){
            throw new NoContentException();
        }

        return meetings;
    }

    @ApiOperation(value = "Get Meeting List by Politician Id", notes = "Get Meeting List")
    @RequestMapping(value = "/meeting/list/politician", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Meeting> getMeetingListByPoliticianId(@RequestParam String politicianId) {

        List<Meeting> meetings = meetingRepository.findByPoliticianId(politicianId);
        if(meetings == null || meetings.size() == 0){
            throw new NoContentException();
        }

        return meetings;
    }

    @ApiOperation(value = "Get Meeting List by Region", notes = "Get Meeting List")
    @RequestMapping(value = "/meeting/list/region", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Meeting> getMeetingListByRegion(@RequestParam String region) {

        List<Meeting> meetings = meetingRepository.findByRegion(region);
        if(meetings == null || meetings.size() == 0){
            throw new NoContentException();
        }

        return meetings;
    }

    @ExceptionHandler(ExistIdException.class)
    @ResponseStatus(HttpStatus.RESET_CONTENT)
    public void ExistMeetingId(){

    }

    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void NonContent(){

    }
}
