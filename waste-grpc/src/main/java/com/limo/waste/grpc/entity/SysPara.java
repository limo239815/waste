package com.limo.waste.grpc.entity;

import com.limo.waste.grpc.util.CommonConstant;
import com.limo.waste.grpc.util.OperateTypeEnum;
import lombok.Data;

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

    public SysPara(String userId,String userName,String currentPassword,String employeeId,String employeeName,String accessToken){
        init();
        this.accessToken = accessToken;
        this.userId = userId;
        this.userName = userName;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.currentPassword = currentPassword;
    }
    public SysPara(String userId,String userName,String currentPassword,String employeeId,String employeeName,String accessToken,String entityName){
        init();
        this.accessToken = accessToken;
        this.userId = userId;
        this.userName = userName;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.currentPassword = currentPassword;
        this.entityName = entityName;
    }
    private void init(){
        this.setMethod("queryGenericReadData");
        this.setFindDefault("N");
        this.setClientType("web");
        this.setAppKey(CommonConstant.APP_KEY);
        this.setOperateType(Integer.parseInt(OperateTypeEnum.QUERY.getKey()));
        this.setSecret(CommonConstant.SECRET);
    }
    public SysPara(){
        init();
        this.setAccessToken("undefinedNODEFINE");
        this.setUserId("18811391133");
        this.setUserName("location");
        this.setCurrentPassword("$SHA$hcAC9dhBjTXBlr$C1AtlucqsGiJ6HTNfu-S8Jq3eE8");
        this.setEmployeeId("10010");
        this.setEmployeeName("location");
    }
    public SysPara(String ddTenantId){
        init();
        this.setAccessToken("undefinedNODEFINE");
        this.setUserId("18811391133");
        this.setUserName("location");
        this.setCurrentPassword("$SHA$hcAC9dhBjTXBlr$C1AtlucqsGiJ6HTNfu-S8Jq3eE8");
        this.setEmployeeId("10010");
        this.setEmployeeName("location");
        this.tenantId = ddTenantId;
    }
    public SysPara(String ddTenantId,String entityName){
        init();
        this.setAccessToken("undefinedNODEFINE");
        this.setUserId("18811391133");
        this.setUserName("location");
        this.setCurrentPassword("$SHA$hcAC9dhBjTXBlr$C1AtlucqsGiJ6HTNfu-S8Jq3eE8");
        this.setEmployeeId("10010");
        this.setEmployeeName("location");
        this.tenantId = ddTenantId;
        this.entityName = entityName;
    }
}
