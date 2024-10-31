package com.limo.waste.grpc.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* 非注解方式获取
import java.io.InputStream;
import java.util.Properties;*/

/**
 * @Author limo
 * @Date 2024/6/27 15:53
 * @Description: 获取配置文件属性
 */
@Component
public class CommonUtil {
    @Value("${ddTenantId}")
    private String defaultDdTenantId;
    @Value("${employeeId}")
    private String employeeId;
    @Value("${useToken}")
    private String useToken;

    public String getUseToken() {
        return useToken;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDefaultDdTenantId() {
        return defaultDdTenantId;
    }

    public String getUrl() {
        return "http://127.0.0.1:9800/ddapi/outerService/request";
    }

}
