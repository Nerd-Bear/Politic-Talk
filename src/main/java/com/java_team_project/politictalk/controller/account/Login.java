package com.java_team_project.politictalk.controller.account;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Account", tags = "Account")
public class Login {
    @ApiOperation(value = "Log in", notes = "Log in")
    @RequestMapping(value = "/account/login", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "User ID", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "password", value = "User password", required = true, dataType = "string", paramType = "json")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "login success", )
    })
    public String login() {
        /*
        아이디 패스워드를 db에서 찾고 존재하면 Access Token 리턴
         */
        String accessToken = new String("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYmYiOjE1MzA1ODI5MzYsImZyZXNoIjpmYWxzZSwianRpIjoiZjVkYjQ2YjktZDRiYi00OWZiLWE2OWYtOWY3NDhmNzZlZmJkIiwiaWF0IjoxNTMwNTgyOTM2LCJpZGVudGl0eSI6ImIzMGU0NjFmLWU1ZWItNDZjZi1iZDU5LTQ3NTg2ZDUyMDZjZSIsImV4cCI6MTUzMzE3NDkzNiwidHlwZSI6ImFjY2VzcyJ9.rtlCRuFXNrlylrAJVTcHc06X1gn1NUJkS-RU71dUosQ");
        return accessToken;
    }
}
