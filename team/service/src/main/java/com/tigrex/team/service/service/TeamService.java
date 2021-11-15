package com.tigrex.team.service.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tigrex.team.service.bo.TeamBO;
import com.tigrex.team.service.po.TeamDO;

import java.util.List;

public interface TeamService {

    List<TeamBO> list(QueryWrapper<TeamDO> wrapper);
}
