package com.tigrex.darkness.provider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linus
 */
@FeignClient(name = "provider", contextId = "user")
public interface UserClient {

    @RequestMapping(value = "/hello")
    String hello();
}
