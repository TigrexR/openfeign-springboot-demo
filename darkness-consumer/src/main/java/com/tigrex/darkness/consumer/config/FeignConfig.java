package com.tigrex.darkness.consumer.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author linus
 */
@Configuration
@EnableFeignClients({"com.tigrex.darkness.provider.client"})
public class FeignConfig {
}
