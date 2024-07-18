package com.limo.waste.common.redis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author limo
 * @Date 2024/7/17 18:47
 * @Description:
 */
@Component
public class RedisInitializer implements CommandLineRunner {

    @Resource
    private RedisConfigService redisConfigService;

    @Resource
    private DynamicRedisConnectionFactory dynamicRedisConnectionFactory;

    @Override
    public void run(String... args) throws Exception {
        List<RedisConfigDO> redisConfigDOS = redisConfigService.getRedisConfigs();
        dynamicRedisConnectionFactory.initialize(redisConfigDOS);
    }
}
