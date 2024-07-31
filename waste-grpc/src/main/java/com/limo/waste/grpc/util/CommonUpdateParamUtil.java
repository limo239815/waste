package com.limo.waste.grpc.util;

import com.limo.waste.grpc.entity.CommonUpdateParam;
import com.limo.waste.grpc.entity.UserLogin;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @Author limo
 * @Date 2024/7/30 18:40
 * @Description:
 */
@Component
public class CommonUpdateParamUtil {

    @Resource
    UserUtil userUtil;

    public CommonUpdateParam initCommonUpdateParam(String ddTenantId, String billTypeId, String billTypeName, String operateType){
        if (!StringUtils.hasLength(ddTenantId)){
            ddTenantId = new CommonUtil().getDefaultDdTenantId();
        }
        UserLogin userLogin = userUtil.initUserLogin(ddTenantId);
        return new CommonUpdateParam(ddTenantId,billTypeId,billTypeName,operateType,userLogin.getUserLoginId(), userLogin.getUserLoginName(), userLogin.getWareHouseId(),userLogin.getAccessToken());
    }
    public CommonUpdateParam initCommonDeleteParam(String ddTenantId,String billTypeId,String billTypeName,String operateType){
        if (!StringUtils.hasLength(ddTenantId)){
            ddTenantId = new CommonUtil().getDefaultDdTenantId();
        }
        UserLogin userLogin = userUtil.initUserLogin(ddTenantId);
        return new CommonUpdateParam().getCommonDeleteParam(ddTenantId,billTypeId,billTypeName,operateType,userLogin.getUserLoginId(), userLogin.getUserLoginName(), userLogin.getWareHouseId(),userLogin.getAccessToken());
    }
}
