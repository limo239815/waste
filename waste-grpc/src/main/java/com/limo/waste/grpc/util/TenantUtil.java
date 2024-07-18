package com.limo.waste.grpc.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author limo
 * @Date 2024/6/27 15:53
 * @Description:
 */
@Component
public class TenantUtil {

    @Value("${ddTenantId}")
    private String defaultDdTenantId;

    public String getDefaultDdTenantId() {
        return defaultDdTenantId;
    }
}
