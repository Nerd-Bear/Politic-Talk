package com.java_team_project.politictalk.controller.recall;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.json.request.RecallVoteRequest;
import com.java_team_project.politictalk.model.recall.Recall;
import com.java_team_project.politictalk.model.recall.RecallRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@Api(value = "Recall", tags = "Recall")
public class RecallVote {

    @Autowired
    RecallRepository recallRepository;

    @ApiOperation(value = "Approve Recall", notes = "Vote Recall")
    @RequestMapping(value = "/recall/vote", method = RequestMethod.PATCH)
    @ResponseStatus(HttpStatus.CREATED)
    public String approveRecallOpinion(@RequestBody @Valid RecallVoteRequest recallVoteRequest) {

        Recall recall = recallRepository.findByRecallId(recallVoteRequest.getRecallId());
        if (recall == null) {
            throw new NoContentException();
        }

        ArrayList<String> approve = recall.getApprove();

        String user = recallVoteRequest.getRecallId();
        String result;
        if (approve.contains(user)){
            approve.remove(user);
            result = "canceled";
        } else {
            approve.add(user);
            result = "success";
        }

        recallRepository.save(recall);

        return result;
    }

    @ApiOperation(value = "Disapprove Recall", notes = "Vote Recall")
    @RequestMapping(value = "/recall/vote", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.CREATED)
    public String disapproveRecall(@RequestBody @Valid RecallVoteRequest recallVoteRequest) {

        Recall recall = recallRepository.findByRecallId(recallVoteRequest.getRecallId());
        if (recall == null) {
            throw new NoContentException();
        }

        ArrayList<String> disApprove = recall.getDisApprove();

        String user = recallVoteRequest.getRecallId();
        String result;
        if (disApprove.contains(user)){
            disApprove.remove(user);
            result = "canceled";
        } else {
            disApprove.add(user);
            result = "success";
        }
        recallRepository.save(recall);
        return result;
    }
}
