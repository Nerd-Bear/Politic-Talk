package com.java_team_project.politictalk.controller.account;

import io.swagger.annotations.Api;
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
@Api(value = "Account", tags = "Account")
public class Signup {
    @ApiOperation(value = "Signup", notes = "Signup")
    @RequestMapping(value = "/account/signup", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "Account ID", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "password", value = "Account password", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "name", value = "Account name", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "bitrhDay", value = "Account birth day", required = true, dataType = "string", paramType = "json"),
            @ApiImplicitParam(name = "region", value = "Account region", required = true, dataType = "string", paramType = "json")
    })
    public UUID signup() {
        /*
        회원정보를 입력받고 DB에 저장시켜 회원가입 완료 후 유저 id를 리턴
         */
        UUID userId = UUID.randomUUID();
        return userId;
    }

}
