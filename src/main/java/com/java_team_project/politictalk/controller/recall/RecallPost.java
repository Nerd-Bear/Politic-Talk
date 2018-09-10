package com.java_team_project.politictalk.controller.recall;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.model.recall.Recall;
import com.java_team_project.politictalk.model.recall.RecallRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.UUID;

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
        if(recall == null){
            throw new NoContentException();
        }

        return recall;
    }

    @ApiOperation(value = "Get Discontent List", notes = "Get Discontent List")
    @RequestMapping(value = "/recall/discontent/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontentList() {
        /*
        불만 게시글 목록을 리턴함
         */
        HashMap<String, Object> discontentList = new HashMap<>();
        return discontentList;
    }

    @ApiOperation(value = "Get Discontent List", notes = "Get Discontent List")
    @RequestMapping(value = "/recall/discontent/list/politician", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getDiscontentListByPoliticianId(@RequestParam String politicianId) {
        /*
        정치인 id를 받아 그 정치인에 대한 불만 게시글 목록을 리턴함
         */
        HashMap<String, Object> discontentList = new HashMap<>();
        return discontentList;
    }

    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void noContentException(){

    }
}
