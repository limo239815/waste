package com.limo.waste.grpc.entity;

import com.limo.waste.grpc.util.TenantUtil;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.util.StringUtils;

/**
 * @Author limo
 * @Date 2024/6/27 16:17
 * @Description:
 */
@Accessors(chain = true)
@Data
public class CommonUpdateParam {
    private String methord;

    private String billIds;

    private String operateType;

    private String edStatus;

    private String billItemJson;

    private String userName;

    private String billJson;

    private String userId;

    private String billId;

    private String tenantId;

    private String wareHouseId;

    private String billTypeName;

    private String key;

    private String billTypeId;

    public CommonUpdateParam getCommonUpdateParam(String ddTenantId){
        if (!StringUtils.hasLength(ddTenantId)){
            tenantId = new TenantUtil().getDefaultDdTenantId();
        }
        this.methord = "saveTask";
        UserLogin userLogin = new UserLogin().getUserLogin(tenantId);
        this.userId = userLogin.getUserLoginId();
        this.userName = userLogin.getUserLoginName();
        this.wareHouseId = userLogin.getWareHouseId();
        this.key = "93785204";
        return this;
    }
}
