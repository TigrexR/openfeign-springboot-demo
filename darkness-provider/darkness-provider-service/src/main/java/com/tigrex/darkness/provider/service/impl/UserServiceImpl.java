package com.tigrex.darkness.provider.service.impl;

import com.tigrex.darkness.provider.mapper.UserMapper;
import com.tigrex.darkness.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
}
