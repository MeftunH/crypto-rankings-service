package com.crs.cryptorankingsservice.config;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import io.github.dengliming.redismodule.redisjson.client.RedisJSONClient;
import io.github.dengliming.redismodule.redistimeseries.RedisTimeSeries;
import io.github.dengliming.redismodule.redistimeseries.client.RedisTimeSeriesClient;
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
        config.useSingleServer()
                .setAddress(redisUrl);
        return config;
    }
    @Bean
    public RedisTimeSeriesClient redisTimeSeriesClient()
    {
        return new RedisTimeSeriesClient(config());
    }
    @Bean
    public RedisTimeSeries redisTimeSeriesClient(Config config)
    {
        return new RedisTimeSeriesClient(config).getRedisTimeSeries();
    }

    @Bean
    public RedisJSONClient redisJSONClient()
    {
        return new RedisJSONClient(config());
    }

    @Bean
    public RedisJSONClient redisJSONClient(RedisJSONClient redisJSONClient)
    {
    return redisJSONClient;
    
    }
}
