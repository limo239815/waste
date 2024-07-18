package com.limo.waste.common.util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.util.StringUtils;

/**
 * @Author
 * @Description redis 监听配置
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<Object,Object> redisTemplate(@Qualifier("firstLettuceConnectionFactory") LettuceConnectionFactory connectionFactory/*RedisConnectionFactory connectionFactory*/){
        RedisTemplate<Object,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        //序列化和反序列化redis的value值
        template.setKeySerializer(RedisSerializer.string());
        template.setHashKeySerializer(RedisSerializer.string());

        template.setHashValueSerializer(RedisSerializer.string());
        template.setValueSerializer(RedisSerializer.string());
        return template;
    }
    @Bean
    public RedisTemplate<Object,Object> redisTemplateSecond(@Qualifier("secondLettuceConnectionFactory")LettuceConnectionFactory connectionFactory){
        RedisTemplate<Object,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        //序列化和反序列化redis的value值
        template.setKeySerializer(RedisSerializer.string());
        template.setHashKeySerializer(RedisSerializer.string());

        template.setHashValueSerializer(RedisSerializer.string());
        template.setValueSerializer(RedisSerializer.string());
        return template;
    }

    @Bean
    public LettuceConnectionFactory secondLettuceConnectionFactory(@Value("${spring.redis2.host}") String host,
                                                                   @Value("${spring.redis2.port}") int port,
                                                                   @Value("${spring.redis2.password:}") String password) {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(host, port);
        if (StringUtils.hasLength(password)) {
            config.setPassword(password);
        }

        return new LettuceConnectionFactory(config);
    }
    @Primary
    @Bean
    public LettuceConnectionFactory firstLettuceConnectionFactory(@Value("${spring.redis.host}") String host,
                                                                  @Value("${spring.redis.port}") int port,
                                                                  @Value("${spring.redis.password:}") String password) {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(host, port);
        if (StringUtils.hasLength(password)) {
            config.setPassword(password);
        }

        return new LettuceConnectionFactory(config);
    }

}
