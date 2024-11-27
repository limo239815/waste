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

    private final static String CONNECT = "_";
    public void initialize(List<RedisConfigDO> redisConfigs){
        for (RedisConfigDO config : redisConfigs){
            RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
            redisStandaloneConfiguration.setHostName(config.getHost());
            redisStandaloneConfiguration.setPort(config.getPort());
            redisStandaloneConfiguration.setPassword(config.getPassword());
            redisStandaloneConfiguration.setDatabase(config.getDbIndex());
            LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration);
            connectionFactory.afterPropertiesSet();

            redisConnectionFactoryMap.put(config.getHost()+CONNECT+config.getDbIndex(),connectionFactory);
        }

    }

    public LettuceConnectionFactory getConnectionFactory(String host,int dbIndex){
        return redisConnectionFactoryMap.get(host+CONNECT+dbIndex);
    }
    public LettuceConnectionFactory getConnectionFactory(String host){
        int dbIndex = 0;
        return redisConnectionFactoryMap.get(host+CONNECT+dbIndex);
    }

}
