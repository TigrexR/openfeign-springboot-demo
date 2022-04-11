package com.tigrex.darkness.consumer.controller;

import com.tigrex.darkness.provider.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/test")
@RefreshScope
public class TestController {

    @Value("${isUse}")
    private boolean isUse;

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/sayHello")
    public String sayHello() {
        return userClient.hello();
    }
}
