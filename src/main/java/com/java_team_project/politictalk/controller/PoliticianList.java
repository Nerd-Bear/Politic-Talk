package com.java_team_project.politictalk.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@Api(value = "Politician List", tags = "Politician List")
public class PoliticianList {
    @ApiOperation(value = "Get Politician List", notes = "Get Politician List")
    @RequestMapping(value = "/recall/politician List", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "region", value = "politician region", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "position", value = "politician position", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "politician name", required = false, dataType = "String", paramType = "query")
    })
    public HashMap<String, Object> getPoliticians(@RequestParam String region, @RequestParam String position, @RequestParam String name){
        /*
        정치인 목록을 DB에서 끌어와 리스폰스 해줌
         */
        HashMap<String, Object> politicianList = new HashMap<>();
        return politicianList;
    }
}
