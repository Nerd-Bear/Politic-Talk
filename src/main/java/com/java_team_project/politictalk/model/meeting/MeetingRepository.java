package com.java_team_project.politictalk.model.meeting;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface MeetingRepository extends MongoRepository<Meeting, Long> {
    Meeting findFirstByMeetingId(String meetingId);

    List<Meeting> findAllByAuthor(String author);

    List<Meeting> findAllByDate(Date meetingDate);

    List<Meeting> findAllByRegion(String region);

}
