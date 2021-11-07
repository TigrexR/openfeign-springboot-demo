package com.tigrex.game.service.service;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.tigrex.game.api.po.StatsDO;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

public interface StatsService {

    List<StatsDO> findAll(String collectionName);

    StatsDO insert(StatsDO data, String collectionName);

    UpdateResult updateFirst(Query query, Update update, String collectionName);

    DeleteResult remove(Query query, String collectionName);
}
