package com.limo.waste.grpc.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

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
    @Value("${ip}")
    private String ip;

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
        if (StringUtils.hasLength(ip)){
            return "http://"+ip+":9800/ddapi/outerService/request";
        }
        return "http://127.0.0.1:9800/ddapi/outerService/request";
    }

}
