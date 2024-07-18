package com.limo.waste.common.redis;

import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author limo
 * @Date 2024/7/17 18:42
 * @Description:
 */
@Component
public class DynamicRedisConnectionFactory {

    private final Map<String, LettuceConnectionFactory> redisConnectionFactoryMap = new HashMap<>();

    public void initialize(List<RedisConfigDO> redisConfigs){
        for (RedisConfigDO config : redisConfigs){
            RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
            redisStandaloneConfiguration.setHostName(config.getHost());
            redisStandaloneConfiguration.setPort(config.getPort());
            redisStandaloneConfiguration.setPassword(config.getPassword());

            LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration);
            connectionFactory.afterPropertiesSet();

            redisConnectionFactoryMap.put(config.getHost(),connectionFactory);
        }

    }

    public LettuceConnectionFactory getConnectionFactory(String host){
        return redisConnectionFactoryMap.get(host);
    }

}
