package com.limo.waste.grpc.util;

import com.limo.waste.grpc.entity.SysPara;
import com.limo.waste.grpc.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @Author limo
 * @Date 2024/7/30 18:10
 * @Description:
 */
@Component
public class SysParaUtil {
    @Resource
    private UserUtil userUtil;

    @Resource
    private CommonUtil commonUtil;

    public SysPara initSysPara(String ddTenantId) {
        return getSysPara(ddTenantId, "");
    }

    public SysPara initSysPara(String ddTenantId, String entityName) {
        return getSysPara(ddTenantId, entityName);
    }

    private SysPara getSysPara(String ddTenantId, String entityName) {
        if (commonUtil.getUseToken().equalsIgnoreCase("yes")) {
            User user = userUtil.getUser(new User().setDdTenantId(ddTenantId).setEmployeeId(commonUtil.getEmployeeId()));
            if (StringUtils.hasLength(entityName)) {
                return new SysPara(ddTenantId, user.getUserId(), user.getEmployeeName(), user.getUserPassword(), user.getEmployeeId(), user.getEmployeeName(), user.getAccessToken(), entityName);
            } else {
                return new SysPara(ddTenantId, user.getUserId(), user.getEmployeeName(), user.getUserPassword(), user.getEmployeeId(), user.getEmployeeName(), user.getAccessToken());
            }
        }
        return new SysPara(ddTenantId);
    }

}
