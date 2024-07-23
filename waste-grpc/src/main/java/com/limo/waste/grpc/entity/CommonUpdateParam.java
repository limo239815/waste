package com.limo.waste.grpc.entity;

import com.limo.waste.grpc.util.CommonConstant;
import com.limo.waste.grpc.util.CommonUtil;
import com.limo.waste.grpc.util.OperateTypeEnum;
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

    private String edStatus;

    private String billItemJson;

    private String userName;

    private String billJson;

    private String billId;

    private String key;

    private String billTypeId;
    private String billTypeName;
    private String operateType;
    private String userId;
    private String tenantId;
    private String wareHouseId;
    private String appKey;
    private String secret;
    private String accessToken;

    public CommonUpdateParam getCommonUpdateParam(String ddTenantId,String billTypeId,String billTypeName,String operateType){
        if (!StringUtils.hasLength(ddTenantId)){
            ddTenantId = new CommonUtil().getDefaultDdTenantId();
        }
        UserLogin userLogin = new UserLogin().getUserLogin(ddTenantId);
        this.billTypeId = billTypeId;
        this.billTypeName = billTypeName;
        this.operateType = operateType;
        this.userId = userLogin.getUserLoginId();
        this.userName = userLogin.getUserLoginName();
        this.wareHouseId = userLogin.getWareHouseId();
        if (new CommonUtil().getUseToken().equalsIgnoreCase("yes")){
            this.tenantId = ddTenantId;
            this.appKey = CommonConstant.APP_KEY;
            this.secret = CommonConstant.SECRET;
            this.accessToken = userLogin.getAccessToken();
        }else {
            this.methord = "saveTask";
            this.edStatus= OperateTypeEnum.VIEW.getCode();
            this.key = "93785204";
        }
        return this;
    }
    public CommonUpdateParam getCommonDeleteParam(String ddTenantId,String billTypeId,String billTypeName,String operateType){
        if (!StringUtils.hasLength(ddTenantId)){
            ddTenantId = new CommonUtil().getDefaultDdTenantId();
        }
        UserLogin userLogin = new UserLogin().getUserLogin(ddTenantId);
        this.billTypeId = billTypeId;
        this.billTypeName = billTypeName;
        this.operateType = operateType;
        this.userId = userLogin.getUserLoginId();
        this.userName = userLogin.getUserLoginName();
        this.wareHouseId = userLogin.getWareHouseId();
        if (new CommonUtil().getUseToken().equalsIgnoreCase("yes")){
            this.tenantId = ddTenantId;
            this.appKey = CommonConstant.APP_KEY;
            this.secret = CommonConstant.SECRET;
            this.accessToken = userLogin.getAccessToken();
        }else {
            this.methord = "saveTask";
            this.edStatus="delete";
            this.key = "93785204";
        }
        return this;
    }
}
