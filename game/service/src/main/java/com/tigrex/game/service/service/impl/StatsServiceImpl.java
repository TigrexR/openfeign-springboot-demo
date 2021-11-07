package com.tigrex.game.service.service.impl;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.tigrex.game.api.po.StatsDO;
import com.tigrex.game.service.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "statsService")
public class StatsServiceImpl implements StatsService {

    @Autowired
    private MongoTemplate template;

    @Override
    public List<StatsDO> findAll(String collectionName) {
        return template.findAll(StatsDO.class, collectionName);
    }

    @Override
    public StatsDO insert(StatsDO data, String collectionName) {
        return template.insert(data, collectionName);
    }

    @Override
    public UpdateResult updateFirst(Query query, Update update, String collectionName) {
        return template.updateFirst(query, update, collectionName);
    }

    @Override
    public DeleteResult remove(Query query, String collectionName) {
        return template.remove(query, collectionName);
    }
}
