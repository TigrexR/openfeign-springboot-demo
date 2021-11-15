package com.tigrex.game.service.service;

import com.tigrex.game.service.bo.StatsBO;
import com.tigrex.game.service.vo.StatsVO;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

public interface StatsService {

    List<StatsBO> findAll();

    StatsBO insert(StatsVO data);

    StatsBO updateFirst(Query query, Update update);

    StatsBO remove(Query query);
}
