package com.java_team_project.politictalk.controller.meeting;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.model.meeting.MeetingReviewRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
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
    public List<com.java_team_project.politictalk.model.meeting.MeetingReview> getMeetingReviewList() {

        List<com.java_team_project.politictalk.model.meeting.MeetingReview> meetingReviews = meetingReviewRepository.findAll();
        if (meetingReviews == null || meetingReviews.size() == 0) {
            throw new NoContentException();
        }

        return meetingReviews;
    }

    @ApiOperation(value = "Get Meeting Review List by poltician id", notes = "Get Meeting Review List")
    @RequestMapping(value = "/meeting/review/list/politician", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<com.java_team_project.politictalk.model.meeting.MeetingReview> getMeetingReviewListByPolitianId(@RequestParam String politicianId) {

        List<com.java_team_project.politictalk.model.meeting.MeetingReview> meetingReviews = meetingReviewRepository.findAllByPoliticianId(politicianId);
        if (meetingReviews == null || meetingReviews.size() == 0) {
            throw new NoContentException();
        }

        return meetingReviews;
    }

    @ApiOperation(value = "Get Meeting Review List by meeting id", notes = "Get Meeting Review List")
    @RequestMapping(value = "/meeting/review/list/meeting", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<com.java_team_project.politictalk.model.meeting.MeetingReview> getMeetingReviewListByMeetingId(@RequestParam String meetingId) {

        List<com.java_team_project.politictalk.model.meeting.MeetingReview> meetingReviews = meetingReviewRepository.findAllByMeetingId(meetingId);
        if (meetingReviews == null || meetingReviews.size() == 0) {
            throw new NoContentException();
        }

        return meetingReviews;
    }

    @ApiOperation(value = "Get Meeting Review", notes = "Get Meeting Review")
    @RequestMapping(value = "/meeting/review", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public com.java_team_project.politictalk.model.meeting.MeetingReview getMeetingReview(@RequestParam String meetingReviewId) {

        com.java_team_project.politictalk.model.meeting.MeetingReview meetingReview = meetingReviewRepository.findByMeetingReviewId(meetingReviewId);
        if (meetingReview == null) {
            throw new NoContentException();
        }

        return meetingReview;
    }

    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void noContentException() {

    }
}
