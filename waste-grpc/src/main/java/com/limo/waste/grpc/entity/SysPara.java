package com.limo.waste.grpc.entity;

import com.limo.waste.grpc.util.CommonConstant;
import com.limo.waste.grpc.util.CommonUtil;
import com.limo.waste.grpc.util.OperateTypeEnum;
import com.limo.waste.grpc.util.UserUtil;
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
        this.setMethod("queryGenericReadData");
        this.setFindDefault("N");
        this.setClientType("web");
        this.setAppKey(CommonConstant.APP_KEY);
        this.setOperateType(Integer.parseInt(OperateTypeEnum.QUERY.getKey()));
        this.setSecret(CommonConstant.SECRET);
        if (new CommonUtil().getUseToken().equalsIgnoreCase("yes")){
            User user = new UserUtil().getUser(new User().setDdTenantId(this.tenantId).setEmployeeId(new CommonUtil().getEmployeeId()));
            this.setAccessToken(user.getAccessToken());
            this.setUserId(user.getUserId());
            this.setUserName(user.getEmployeeName());
            this.setCurrentPassword(user.getUserPassword());
            this.setEmployeeId(user.getEmployeeId());
            this.setEmployeeName(user.getEmployeeName());
        }else {
            this.setAccessToken("undefinedNODEFINE");
            this.setUserId("18811391133");
            this.setUserName("location");
            this.setCurrentPassword("$SHA$hcAC9dhBjTXBlr$C1AtlucqsGiJ6HTNfu-S8Jq3eE8");
            this.setEmployeeId("10010");
            this.setEmployeeName("location");
        }

    }
    public SysPara getSysPara(String tenantId,String entityName){
        this.entityName = entityName;
        if (!StringUtils.hasLength(tenantId)){
            tenantId = new CommonUtil().getDefaultDdTenantId();
        }
        this.tenantId = tenantId;
        getSysPara();
        return this;
    }
}
