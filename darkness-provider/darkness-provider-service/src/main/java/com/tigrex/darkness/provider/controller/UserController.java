package com.tigrex.darkness.provider.controller;

import com.tigrex.darkness.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world!";
    }
}
