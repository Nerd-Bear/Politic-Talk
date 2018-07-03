package com.java_team_project.politictalk.controller.meeting;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@Api(value = "Meeting", tags = "Meeting")
public class Schedule {
    @ApiOperation(value = "Get Schedule", notes = "Get Schedule")
    @RequestMapping(value = "/meeting/check_schedule", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, Object> getSchedule(@RequestParam String politicianId, @RequestParam int year, @RequestParam int month) {
        /*
        정치인과 년도, 월 을 선택하면 해당 정치인이 해당 월에 무슨 스케쥴이 있고 언제 비어있는지 리턴
         */
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }
}
