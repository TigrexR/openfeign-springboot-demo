package com.tigrex.team.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tigrex.team.service.po.TeamDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeamMapper extends BaseMapper<TeamDO> {
}
