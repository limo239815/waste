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
    private UserUtil userUtil;

    @Resource
    private CommonUtil commonUtil;

    public CommonUpdateParam initCommonUpdateParam(String ddTenantId, String billTypeId, String billTypeName, String operateType) {
        return getUpdateParam(ddTenantId, billTypeId, billTypeName, operateType, true);
    }

    public CommonUpdateParam initCommonDeleteParam(String ddTenantId, String billTypeId, String billTypeName, String operateType) {
        return getUpdateParam(ddTenantId, billTypeId, billTypeName, operateType, false);
    }

    private CommonUpdateParam getUpdateParam(String ddTenantId, String billTypeId, String billTypeName, String operateType, boolean update) {
        if (update) {
            if (!StringUtils.hasLength(ddTenantId)) {
                ddTenantId = commonUtil.getDefaultDdTenantId();
            }
            UserLogin userLogin = userUtil.initUserLogin(ddTenantId);
            return new CommonUpdateParam(ddTenantId, billTypeId, billTypeName, operateType, userLogin.getUserLoginId(), userLogin.getUserLoginName(), userLogin.getWareHouseId(), userLogin.getAccessToken());
        } else {
            if (!StringUtils.hasLength(ddTenantId)) {
                ddTenantId = commonUtil.getDefaultDdTenantId();
            }
            UserLogin userLogin = userUtil.initUserLogin(ddTenantId);
            return new CommonUpdateParam().getCommonDeleteParam(ddTenantId, billTypeId, billTypeName, operateType, userLogin.getUserLoginId(), userLogin.getUserLoginName(), userLogin.getWareHouseId(), userLogin.getAccessToken());
        }
    }
}
