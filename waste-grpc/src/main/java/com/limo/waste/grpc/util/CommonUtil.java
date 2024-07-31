package com.limo.waste.grpc.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* 貌似会死循环
import java.io.InputStream;
import java.util.Properties;*/

/**
 * @Author limo
 * @Date 2024/6/27 15:53
 * @Description:
 */
@Component
public class CommonUtil {
    @Value("${ddTenantId}")
    private String defaultDdTenantId;
    @Value("${employeeId}")
    private String employeeId;
    @Value("${useToken}")
    private String useToken;
    @Value("${goUrl}")
    private String goUrl;

    public String getUseToken() {
        return useToken;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDefaultDdTenantId() {
        return defaultDdTenantId;
    }

    public String getGoUrl() {
        return goUrl;
    }
    /* 貌似会死循环
   public CommonUtil() {
        // 加载配置文件
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.yaml")) {
            if (input != null) {
                properties.load(input);

                // 设置字段值
                this.defaultDdTenantId = properties.getProperty("ddTenantId").replace("\"","");
                this.employeeId = properties.getProperty("employeeId").replace("\"","");
                this.useToken = properties.getProperty("useToken").replace("\"","");
                this.goUrl = properties.getProperty("goUrl").replace("\"","");
            } else {
                log.error("无法找到application.yaml文件");
                this.defaultDdTenantId = "00000";
                this.employeeId = "location@126.com";
                this.useToken = "no";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
