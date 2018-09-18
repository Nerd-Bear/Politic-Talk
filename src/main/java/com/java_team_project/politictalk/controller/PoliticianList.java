package com.java_team_project.politictalk.controller;

import com.java_team_project.politictalk.exception.NoContentException;
import com.java_team_project.politictalk.model.politician.Politician;
import com.java_team_project.politictalk.model.politician.PoliticianRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Politician List", tags = "Politician List")
public class PoliticianList {
    @Autowired
    PoliticianRepository repository;

    @ApiOperation(value = "Get Politician List", notes = "Get Politician List")
    @RequestMapping(value = "/politician/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Politician> getPoliticians(@RequestParam String region,
                                           @RequestParam String position,
                                           @RequestParam String name) {
        List<Politician> politicians;
        if (name.equals("null") && position.equals("null")) {
            politicians = repository.findAllByRegionContaining(region);
        } else if(name.equals("null")){
            politicians = repository.findAllByRegionContainingAndPosition(region, position);
        } else if (position.equals("null")) {
            politicians = repository.findAllByRegionContainingAndName(region, name);
        } else {
            politicians = repository.findAllByRegionContainingAndPositionAndName(region, position, name);
        }

        if (politicians == null || politicians.size() == 0) {
            throw new NoContentException();
        }

        return politicians;
    }

    @ApiOperation(value = "Get Politician",notes = "Get Politician")
    @RequestMapping(value = "/politician", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Politician getPolitician(@RequestParam String politicianId){

        Politician politician = repository.findByPoliticianId(politicianId);
        if(politician == null){
            throw new NoContentException();
        }

        return politician;
    }

    @ExceptionHandler(NoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void noContenetException() {

    }
}
