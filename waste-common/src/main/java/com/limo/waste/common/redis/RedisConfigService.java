package com.limo.waste.common.redis;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author limo
 * @Date 2024/7/17 18:17
 * @Description:
 */
@Service
public class RedisConfigService {

    public List<RedisConfigDO> getRedisConfigs(){
        List<RedisConfigDO> configs = new ArrayList<>();
        configs.add(new RedisConfigDO().setHost("127.0.0.1").setPort(6379));
        configs.add(new RedisConfigDO().setHost("47.100.125.240").setPort(6379).setPassword("forest123456"));
        return configs;
    }

}
