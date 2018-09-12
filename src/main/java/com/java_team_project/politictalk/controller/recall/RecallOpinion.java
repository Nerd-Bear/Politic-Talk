package com.java_team_project.politictalk.controller.recall;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.model.recall.RecallOpinionModel;
import com.java_team_project.politictalk.model.recall.RecallOpinionRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@RestController
@Api(value = "Recall", tags = "Recall")
public class RecallOpinion {

    @Autowired
    RecallOpinionRepository recallOpinionRepository;

    @ApiOperation(value = "Post Recall Opinion", notes = "Post Recall Opinion")
    @RequestMapping(value = "/recall/opinion", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String postRecallOpinion(@RequestBody @Valid final RecallOpinionModel recallOpinionModel) {

        recallOpinionModel.init();
        recallOpinionRepository.save(recallOpinionModel);

        return recallOpinionModel.getRecallId();
    }

    @ApiOperation(value = "Get Discontent Opinion", notes = "Get Discontent Opinion")
    @RequestMapping(value = "/recall/opinion", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public RecallOpinionModel getRecallOpinion(@RequestParam String recallOpinionId) {

        RecallOpinionModel recallOpinion = recallOpinionRepository.findByRecallOpinionId(recallOpinionId);
        if(recallOpinion == null){
            throw new NoContentException();
        }

        return recallOpinion;
    }

    @ApiOperation(value = "Get Discontent Opinion List", notes = "Get Discontent Opinion List")
    @RequestMapping(value = "/recall/opinion/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<RecallOpinionModel> getRecallOpinionList(@RequestParam String recallId) {

        List<RecallOpinionModel> recallOpinionModels = recallOpinionRepository.findAllByRecallId(recallId);
        if(recallOpinionModels == null || recallOpinionModels.size() == 0){
            throw new NoContentException();
        }

        return recallOpinionModels;
    }

    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void noContentException(){

    }
}
