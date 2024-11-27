package com.limo.waste.database.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

/**
 * @Author limo
 * @Date 2024/11/26 17:34
 * @Description:
 */
@Component
public class DynamicRedisConfig {

    @Value("${spring.redis.host}")
    private String hostName;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.password}")
    private String password;
    @Bean
    public LettuceConnectionFactory redisConnectionFactoryDb0(){
       RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
       configuration.setHostName(hostName);
       configuration.setPort(port);
       configuration.setPassword(password);
       configuration.setDatabase(0);
       return new LettuceConnectionFactory(configuration);
    }

    @Bean
    public LettuceConnectionFactory redisConnectionFactoryDb1(){
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
        configuration.setHostName(hostName);
        configuration.setPort(port);
        configuration.setPassword(password);
        configuration.setDatabase(1);
        return new LettuceConnectionFactory(configuration);
    }

    @Bean
    public RedisTemplate<Object,Object> redisTemplateDb0(LettuceConnectionFactory redisConnectionFactoryDb0){
        RedisTemplate<Object,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactoryDb0);
        //序列化和反序列化redis的value值
        template.setKeySerializer(RedisSerializer.string());
        template.setHashKeySerializer(RedisSerializer.string());

        template.setHashValueSerializer(RedisSerializer.string());
        template.setValueSerializer(RedisSerializer.string());
        return template;
    }

    @Bean
    public RedisTemplate<Object,Object> redisTemplateDb1(LettuceConnectionFactory redisConnectionFactoryDb1){
        RedisTemplate<Object,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactoryDb1);
        //序列化和反序列化redis的value值
        template.setKeySerializer(RedisSerializer.string());
        template.setHashKeySerializer(RedisSerializer.string());

        template.setHashValueSerializer(RedisSerializer.string());
        template.setValueSerializer(RedisSerializer.string());
        return template;
    }

}
