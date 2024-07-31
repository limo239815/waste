package com.limo.waste.grpc.entity;

import com.limo.waste.grpc.util.CommonUtil;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @Author limo
 * @Date 2024/6/27 15:05
 * @Description:
 */
@Accessors(chain = true)
@Data
public class UserLogin {
    private String userLoginId;
    private String userLoginDisId;
    private String ddTenantId;
    private String userLoginName;
    private String currentPassword;
    private String isSystem;
    private String enabled;
    private String hasLoggedOut;
    private String requirePasswordChange;
    private String lastCurrencyUom;
    private String lastLocale;
    private String lastTimeZone;
    private Date disabledDateTime;
    private String successiveFailedLogins;
    private String externalAuthId;
    private String userLdapDn;
    private String currFlowId;
    private String serviceId;
    private String currUuid;
    private String companyId;
    private String findDefault;
    private String businessSystemId;
    private String wareHouseId;
    private String wareHouseName;
    private String accessToken;

    private String appKey="7_3couvjpeukmc4wc88ww00s8c0cc4wcswc8404oow8ogwksgcck";
    private String secret="4kztndqf54sgowkcs8kw404c0kc04c0gsgwog8gogwwc8kk8kc";

    public UserLogin(){}

    public UserLogin(String ddTenantId, String userId,String userName,String accessToken,String wareHouseId,String wareHouseName){
        this.userLoginId = userId;
        this.userLoginDisId = userId;
        this.userLoginName = userName;
        this.accessToken = accessToken;
        this.wareHouseId = wareHouseId;
        this.wareHouseName = wareHouseName;
        this.ddTenantId = ddTenantId;
    }

    public UserLogin(String ddTenantId) {
        this.userLoginId = "wes";
        this.userLoginDisId = "wes";
        this.userLoginName = "wes";
        this.wareHouseId = "10000";
        this.wareHouseName = "智能仓";
        this.ddTenantId = ddTenantId;
    }
}
