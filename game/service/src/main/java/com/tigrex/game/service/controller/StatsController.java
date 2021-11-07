package com.tigrex.game.service.controller;

import com.tigrex.game.api.po.StatsDO;
import com.tigrex.game.service.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stats")
public class StatsController {

    @Autowired
    private StatsService service;

    @RequestMapping(value = "/save")
    public StatsDO save(StatsDO data, String collectionName) {
        return service.insert(data, collectionName);
    }
}
