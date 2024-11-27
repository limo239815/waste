package com.limo.waste.common.redis;

import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author limo
 * @Date 2024/7/17 18:50
 * @Description:
 */
@Service
public class RedisNewService {

    @Resource
    private DynamicRedisConnectionFactory dynamicRedisConnectionFactory;

    public void saveData(String host,int dbIndex, String key,String value){
        LettuceConnectionFactory connectionFactory = dynamicRedisConnectionFactory.getConnectionFactory(host, dbIndex);
        StringRedisTemplate redisTemplate = new StringRedisTemplate(connectionFactory);
        redisTemplate.opsForValue().set(key,value);
    }

    public String getData(String host,int dbIndex, String key){
        LettuceConnectionFactory connectionFactory = dynamicRedisConnectionFactory.getConnectionFactory(host, dbIndex);
        StringRedisTemplate redisTemplate = new StringRedisTemplate(connectionFactory);
        return redisTemplate.opsForValue().get(key);
    }

    public void saveData(String host,String key,String value){
        LettuceConnectionFactory connectionFactory = dynamicRedisConnectionFactory.getConnectionFactory(host);
        StringRedisTemplate redisTemplate = new StringRedisTemplate(connectionFactory);
        redisTemplate.opsForValue().set(key,value);
    }

    public String getData(String host,String key){
        LettuceConnectionFactory connectionFactory = dynamicRedisConnectionFactory.getConnectionFactory(host);
        StringRedisTemplate redisTemplate = new StringRedisTemplate(connectionFactory);
        return redisTemplate.opsForValue().get(key);
    }
}
