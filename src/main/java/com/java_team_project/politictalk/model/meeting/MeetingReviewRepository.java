package com.java_team_project.politictalk.model.meeting;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MeetingReviewRepository extends MongoRepository<MeetingReview, String> {
}
