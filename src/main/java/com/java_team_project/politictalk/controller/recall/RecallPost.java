package com.java_team_project.politictalk.controller.recall;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.model.recall.Recall;
import com.java_team_project.politictalk.model.recall.RecallRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "Recall", tags = "Recall")
public class RecallPost {

    @Autowired
    RecallRepository recallRepository;

    @ApiOperation(value = "Post Recall", notes = "Post Recall")
    @RequestMapping(value = "/recall", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public String postRecall(@RequestBody @Valid final Recall recall) {

        recall.init();
        recallRepository.save(recall);

        return recall.getRecallId();
    }

    @ApiOperation(value = "Get Recall", notes = "Get Recall")
    @RequestMapping(value = "/recall", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Recall getRecall(@RequestParam String recallId) {

        Recall recall = recallRepository.findByRecallId(recallId);
        if (recall == null) {
            throw new NoContentException();
        }

        return recall;
    }

    @ApiOperation(value = "Get Recall List", notes = "Get Recall List")
    @RequestMapping(value = "/recall/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Recall> getRecallList() {

        List<Recall> recalls = recallRepository.findAll();
        if (recalls == null || recalls.size() == 0) {
            throw new NoContentException();
        }

        return recalls;
    }

    @ApiOperation(value = "Get Recall List by politician id", notes = "Get Recall List")
    @RequestMapping(value = "/recall/list/politician", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Recall> getRecallListByPoliticianId(@RequestParam String politicianId) {

        List<Recall> recalls = recallRepository.findAllByPoliticianId(politicianId);
        if (recalls == null || recalls.size() == 0) {
            throw new NoContentException();
        }

        return recalls;
    }

    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void noContentException() {

    }
}
