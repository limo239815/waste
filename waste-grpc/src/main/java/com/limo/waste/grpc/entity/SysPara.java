package com.limo.waste.grpc.entity;

import com.limo.waste.grpc.util.TenantUtil;
import lombok.Data;
import org.springframework.util.StringUtils;

/**
 * @Author limo
 * @Date 2024/6/27 15:48
 * @Description:
 */
@Data
public class SysPara {
    private String entityName;

    private String billTypeId;
    private Integer operateType;
    private String appKey;
    private String secret;
    private String userId;
    private String userName;
    private String tenantId;
    private String currentPassword;
    private String employeeId;
    private String employeeName;
    private String businessSystemId;
    private String businessSystemName;
    private String wareHouseId;
    private String wareHouseName;
    private String findDefault;
    private String clientType;
    private String accessToken;
    private String method;
    public void getSysPara(){
        this.setAccessToken("undefinedNODEFINE");
        this.setMethod("queryGenericReadData");
        this.setAppKey("7_3couvjpeukmc4wc88ww00s8c0cc4wcswc8404oow8ogwksgcck");
        this.setOperateType(4);
        this.setSecret("4kztndqf54sgowkcs8kw404c0kc04c0gsgwog8gogwwc8kk8kc");
        this.setUserId("18811391133");
        this.setUserName("location");
        this.setCurrentPassword("$SHA$hcAC9dhBjTXBlr$C1AtlucqsGiJ6HTNfu-S8Jq3eE8");
        this.setEmployeeId("10010");
        this.setEmployeeName("location");
        this.setFindDefault("N");
        this.setClientType("web");
    }
    public SysPara getSysPara(String tenantId,String entityName){
        getSysPara();
        this.entityName = entityName;
        if (!StringUtils.hasLength(tenantId)){
            tenantId = new TenantUtil().getDefaultDdTenantId();
        }
        this.tenantId = tenantId;
        return this;
    }
}
