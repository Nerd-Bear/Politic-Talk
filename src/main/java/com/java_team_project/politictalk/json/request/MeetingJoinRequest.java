package com.java_team_project.politictalk.json.request;

public class MeetingJoinRequest {
    private String meetingId;
    private String userId;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
