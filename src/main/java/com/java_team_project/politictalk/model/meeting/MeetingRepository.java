package com.java_team_project.politictalk.model.meeting;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface MeetingRepository extends MongoRepository<Meeting, String> {
    Meeting findByMeetingId(String meetingId);
}
