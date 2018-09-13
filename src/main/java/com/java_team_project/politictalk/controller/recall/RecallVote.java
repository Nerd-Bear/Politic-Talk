package com.java_team_project.politictalk.controller.recall;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.json.request.RecallVoteRequest;
import com.java_team_project.politictalk.model.recall.Recall;
import com.java_team_project.politictalk.model.recall.RecallOpinionModel;
import com.java_team_project.politictalk.model.recall.RecallOpinionRepository;
import com.java_team_project.politictalk.model.recall.RecallRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "Recall", tags = "Recall")
public class RecallVote {

    @Autowired
    RecallRepository recallRepository;

    @ApiOperation(value = "Approve Recall", notes = "Vote Recall")
    @RequestMapping(value = "/recall/vote", method = RequestMethod.PATCH)
    @ResponseStatus(HttpStatus.CREATED)
    public void approveRecallOpinion(@RequestBody @Valid RecallVoteRequest recallVoteRequest) {

        Recall recall = recallRepository.findByRecallId(recallVoteRequest.getRecallId());
        if(recall == null){
            throw new NoContentException();
        }

        ArrayList<String> approve = recall.getApprove();

        String user = recallVoteRequest.getRecallId();
        if(approve.contains(user))
            approve.remove(user);
        else
            approve.add(user);
        recallRepository.save(recall);
    }

    @ApiOperation(value = "Disapprove Recall", notes = "Vote Recall")
    @RequestMapping(value = "/recall/vote", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.CREATED)
    public void disapproveRecall(@RequestBody @Valid RecallVoteRequest recallVoteRequest) {

        Recall recall = recallRepository.findByRecallId(recallVoteRequest.getRecallId());
        if(recall == null){
            throw new NoContentException();
        }

        ArrayList<String> disApprove = recall.getDisApprove();

        String user = recallVoteRequest.getRecallId();
        if(disApprove.contains(user))
            disApprove.remove(user);
        else
            disApprove.add(user);
        recallRepository.save(recall);
    }
}
