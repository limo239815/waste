package com.limo.wasteservice.start;

import com.limo.waste.common.redis.RedisNewService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class WasteServiceStartApplicationTests {

    @Resource
    RedisNewService redisNewService;

    @Test
    void test(){
            redisNewService.saveData("localhost","test","wao");
        System.out.println(redisNewService.getData("localhost","test"));
        redisNewService.saveData("47.100.125.240","test","wao");
        System.out.println(redisNewService.getData("47.100.125.240","test"));
    }

}
