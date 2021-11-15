package com.tigrex.team.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrex.core.utils.JacksonUtils;
import com.tigrex.team.service.bo.TeamBO;
import com.tigrex.team.service.mapper.TeamMapper;
import com.tigrex.team.service.po.TeamDO;
import com.tigrex.team.service.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "teamService")
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamMapper mapper;

    @Override
    public List<TeamBO> list(QueryWrapper<TeamDO> wrapper) {
        return JacksonUtils.getJackson().convertValue(mapper.selectList(wrapper), new TypeReference<>() {});
    }
}
