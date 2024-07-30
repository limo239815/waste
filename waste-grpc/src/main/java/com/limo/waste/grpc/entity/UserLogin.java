package com.limo.waste.grpc.entity;

import com.limo.waste.grpc.util.CommonUtil;
import com.limo.waste.grpc.util.UserUtil;
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

    public UserLogin getUserLogin(String ddTenantId) {
        if (StringUtils.hasLength(ddTenantId)) {
            this.ddTenantId = ddTenantId;
        } else {
            this.ddTenantId = new CommonUtil().getDefaultDdTenantId();
        }
        if (new CommonUtil().getUseToken().equalsIgnoreCase("yes")){
            User user = new UserUtil().getUser(new User().setEmployeeId("location").setDdTenantId(this.ddTenantId));
            this.userLoginId = user.getUserId();
            this.userLoginDisId = user.getUserId();
            this.userLoginName = user.getEmployeeName();
            this.accessToken = user.getAccessToken();
            Warehouse warehouse = new UserUtil().getWarehouse(this.ddTenantId);
            this.wareHouseId = warehouse.getWareHouseId();
            this.wareHouseName = warehouse.getWareHouseName();
        }else {
            this.userLoginId = "wes";
            this.userLoginDisId = "wes";
            this.userLoginName = "wes";
            this.wareHouseId = "10000";
            this.wareHouseName = "智能仓";
        }

        return this;
    }
    public UserLogin getUserLogin(String ddTenantId,String employeeId) {
        if (StringUtils.hasLength(ddTenantId)) {
            this.ddTenantId = ddTenantId;
        } else {
            this.ddTenantId = new CommonUtil().getDefaultDdTenantId();
        }
        if (new CommonUtil().getUseToken().equalsIgnoreCase("yes")){
            User user = new UserUtil().getUser(new User().setEmployeeId(employeeId).setDdTenantId(this.ddTenantId));
            this.userLoginId = user.getUserId();
            this.userLoginDisId = user.getUserId();
            this.userLoginName = user.getEmployeeName();
            this.accessToken = user.getAccessToken();
            Warehouse warehouse = new UserUtil().getWarehouse(this.ddTenantId);
            this.wareHouseId = warehouse.getWareHouseId();
            this.wareHouseName = warehouse.getWareHouseName();
        }else {
            this.userLoginId = "wes";
            this.userLoginDisId = "wes";
            this.userLoginName = "wes";
            this.wareHouseId = "10000";
            this.wareHouseName = "智能仓";
        }

        return this;
    }
}
