package com.tigrex.game.service.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.tigrex.game.api.bo.StatsBO;
import com.tigrex.game.api.po.StatsDO;
import com.tigrex.game.api.vo.StatsVO;
import com.tigrex.game.service.service.StatsService;
import com.tigrex.game.service.utils.JacksonUtils;
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
    public List<StatsBO> findAll() {
        return JacksonUtils.getJackson().convertValue(template.findAll(StatsDO.class, StatsBO.collectionName), new TypeReference<>() {});
    }

    @Override
    public StatsBO insert(StatsVO data) {
        return JacksonUtils.getJackson().convertValue(
                template.insert(JacksonUtils.getJackson().convertValue(data, StatsDO.class), StatsBO.collectionName), StatsBO.class);
    }

    @Override
    public StatsBO updateFirst(Query query, Update update) {
        UpdateResult result = template.updateFirst(query, update, StatsBO.collectionName);
        return null;
    }

    @Override
    public StatsBO remove(Query query) {
        DeleteResult result = template.remove(query, StatsBO.collectionName);
        return null;
    }
}
