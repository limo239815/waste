package com.limo.waste.common.redis;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author limo
 * @Date 2024/7/17 18:16
 * @Description:
 */
@Accessors(chain = true)
@Data
public class RedisConfigDO {

    private String host;

    private int port;

    private String password;

}
