package com.limo.waste.grpc.util.cache;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @Author
 *
 * @Description 缓存配置
 */
@Configuration
public class WasteCacheConfig {

    @Bean
    public Cache<String,Object> cacheManagerForWaste(){
        return Caffeine.newBuilder()
                .expireAfterAccess(6, TimeUnit.HOURS)//过期时间
                .initialCapacity(100)//初始的缓存空间大小
                .maximumSize(1000)//缓存的最大条数
                .build();
    }

}
