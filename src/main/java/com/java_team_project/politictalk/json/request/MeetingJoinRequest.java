package com.java_team_project.politictalk.json.request;

import lombok.Data;

@Data
public class MeetingJoinRequest {
    private String meetingId;
    private String userId;
}
