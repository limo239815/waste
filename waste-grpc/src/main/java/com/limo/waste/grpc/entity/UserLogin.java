package com.limo.waste.grpc.entity;

import com.limo.waste.grpc.util.TenantUtil;
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

    public UserLogin getUserLogin(String ddTenantId){
        if (StringUtils.hasLength(ddTenantId)){
            this.ddTenantId = ddTenantId;
        }else {
            this.ddTenantId =new TenantUtil().getDefaultDdTenantId();
        }
        this.userLoginId = "wes";
        this.userLoginDisId="wes";
        this.userLoginName="wes";
        this.wareHouseId="10000";
        this.wareHouseName="智能仓";
        return this;
    }
}
