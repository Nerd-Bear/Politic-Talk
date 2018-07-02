package com.java_team_project.politictalk.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @ApiOperation(value = "isServerRunning", notes = "서버가 실행되고 있는지 확인하는 API", tags = "Test")

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String isServerRunning(){
        return "Yes, It's running!! You are so great!";
    }
}