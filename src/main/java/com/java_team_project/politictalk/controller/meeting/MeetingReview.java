package com.java_team_project.politictalk.controller.meeting;

import com.java_team_project.politictalk.model.meeting.MeetingReviewRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

@RestController
@Api(value = "Meeting", tags = "Meeting")
public class MeetingReview {

    @Autowired
    MeetingReviewRepository meetingReviewRepository;

    @ApiOperation(value = "Review Meeting", notes = "Review Meeting")
    @RequestMapping(value = "/meeting/review", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String postMeetingReview(@RequestBody com.java_team_project.politictalk.model.meeting.MeetingReview meetingReview) {
        String meetingReviewId = UUID.randomUUID().toString();

        meetingReview.setDate(new Date());
        meetingReview.setMeetingId(meetingReviewId);
        meetingReview.setViewCount(0);

        meetingReviewRepository.save(meetingReview);

        return meetingReviewId;
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
