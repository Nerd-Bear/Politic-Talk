package com.java_team_project.politictalk.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Account {
    @ApiOperation(value = "Signup", notes = "Signup")
    @RequestMapping(value = "/account/signup", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "User ID", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "password", value = "User password", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "name", value = "User name", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "bitrhDay", value = "User birth day", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "region", value = "User region", required = true, dataType = "string", paramType = "json")
    })
    public UUID signup(){
        /*
        회원정보를 입력받고 DB에 저장시켜 회원가입 완료 후 유저 id를 리턴
         */
        UUID userId = UUID.randomUUID();
        return userId;
    }

    @ApiOperation(value = "Log in", notes = "Log in")
    @RequestMapping(value = "/account/login", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "User ID", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "password", value = "User password", required = true, dataType = "string", paramType = "json")
    })
    public void login(){
        /*
        아이디 패스워드를 db에서 찾고 존재하면 로그인
         */
    }

}
