package com.java_team_project.politictalk.controller.account;

import com.java_team_project.politictalk.json.request.AccountLongin;
import com.java_team_project.politictalk.model.account.Account;
import com.java_team_project.politictalk.model.account.AccountRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api(value = "Account", tags = "Account")
public class Login {
    @Autowired
    private AccountRepository accountRepository;

    @ApiOperation(value = "Log in", notes = "Log in")
    @RequestMapping(value = "/account/login", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody @Valid final AccountLongin accountLongin) {
        Account account = accountRepository.findByUserId(accountLongin.getId());
        if (account.getPassword().equals(accountLongin.getPassword())) {
            return account.getUserId();
        } else {
            throw new NullPointerException();
        }
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ExceptionHandler(NullPointerException.class)
    public void loginFailed() {

    }
}