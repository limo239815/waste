package com.limo.waste.grpc.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.Properties;

/**
 * @Author limo
 * @Date 2024/6/27 15:53
 * @Description:
 */
@Slf4j
@Data
public class CommonUtil {
    private String defaultDdTenantId;
    private String employeeId;
    private String useToken;
    private String goUrl;

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
    }
}
