package com.java_team_project.politictalk.controller.meeting;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.exception.ResetContentException;
import com.java_team_project.politictalk.json.request.MeetingJoinRequest;
import com.java_team_project.politictalk.model.account.Account;
import com.java_team_project.politictalk.model.account.AccountRepository;
import com.java_team_project.politictalk.model.meeting.Meeting;
import com.java_team_project.politictalk.model.meeting.MeetingRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Meeting", tags = "Meeting")
public class MeetingJoin {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    MeetingRepository meetingRepository;

    @ApiOperation(value = "Join Meeting", notes = "Join Meeting")
    @RequestMapping(value = "/meeting/join", method = RequestMethod.PATCH)
    @ResponseStatus(HttpStatus.CREATED)
    public String joinMeeting(@RequestBody MeetingJoinRequest meetingJoinRequest) {

        Account user = accountRepository.findByUserId(meetingJoinRequest.getUserId());
        Meeting meeting = meetingRepository.findByMeetingId(meetingJoinRequest.getMeetingId());
        if (user == null || meeting == null) {
            throw new NoContentException();
        }

        String result;
        List<String> participants = meeting.getParticipantId();
        if (participants.contains(user.getUserId())) {
            participants.remove(user.getUserId());
            result = "canceled";
        } else {
            participants.add(user.getUserId());
            result = "success";
        }

        meetingRepository.save(meeting);

        return result;
    }

    @ExceptionHandler(ResetContentException.class)
    @ResponseStatus(HttpStatus.RESET_CONTENT)
    public void alreadyJoinedOrAlreadyQuited() {

    }
}
