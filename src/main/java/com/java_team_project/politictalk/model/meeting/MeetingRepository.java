package com.java_team_project.politictalk.model.meeting;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MeetingRepository extends MongoRepository<Meeting, String> {
    Meeting findByMeetingId(String meetingId);

    List<Meeting> findByPoliticianId(String politicianId);

    List<Meeting> findByRegion(String region);
}
