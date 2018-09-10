package com.java_team_project.politictalk.model.meeting;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MeetingReviewRepository extends MongoRepository<MeetingReview, String> {
    List<MeetingReview> findAllByPoliticianId(String politicianId);
    List<MeetingReview> findAllByMeetingId(String meetingId);
    MeetingReview findByMeetingReviewId(String meetingReviewId);
}
