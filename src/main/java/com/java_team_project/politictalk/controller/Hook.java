package com.java_team_project.politictalk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class Hook {

    @RequestMapping(value = "/hook", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void hook() throws IOException {

        String[] command = {
                "/bin/bash",
                "-c",
                "source /home/ubuntu/Politic-Talk-Backend/deploy.sh"
        };
        Runtime.getRuntime().exec(command);
    }
}
