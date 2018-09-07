package com.java_team_project.politictalk.controller.account;

import com.java_team_project.politictalk.model.account.Account;
import com.java_team_project.politictalk.model.account.AccountRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@Api(value = "Account", tags = "Account")
public class Signup {
    @Autowired
    private AccountRepository accountRepository;

    @ApiOperation(value = "Signup", notes = "Signup")
    @RequestMapping(value = "/account/signup", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public UUID signup(@RequestBody @Valid final Account account) {
        accountRepository.save(account);
        UUID userId = UUID.randomUUID();
        return userId;
    }

}
