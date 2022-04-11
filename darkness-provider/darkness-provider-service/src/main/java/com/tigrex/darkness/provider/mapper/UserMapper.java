package com.tigrex.darkness.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tigrex.darkness.provider.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
