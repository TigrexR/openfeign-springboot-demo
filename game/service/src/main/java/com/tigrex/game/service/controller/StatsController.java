package com.tigrex.game.service.controller;

import com.tigrex.core.utils.JacksonUtils;
import com.tigrex.game.service.vo.StatsVO;
import com.tigrex.game.service.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stats")
public class StatsController {

    @Autowired
    private StatsService service;

    @PostMapping(value = "/save")
    public StatsVO save(@RequestBody() StatsVO data) {
        return JacksonUtils.getJackson().convertValue(service.insert(data), StatsVO.class);
    }
}
