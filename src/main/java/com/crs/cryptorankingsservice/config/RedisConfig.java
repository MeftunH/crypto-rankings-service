package com.crs.cryptorankingsservice.config;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {
    private static final String redisUrl = "redis://localhost:6379";

    @Bean
    public Config config()
    {
        Config config = new Config();
        config.useSingleServer();
    }
}
