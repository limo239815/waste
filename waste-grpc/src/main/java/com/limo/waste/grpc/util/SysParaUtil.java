package com.limo.waste.grpc.util;

import com.limo.waste.grpc.entity.SysPara;
import com.limo.waste.grpc.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author limo
 * @Date 2024/7/30 18:10
 * @Description:
 */
@Component
public class SysParaUtil {
    @Resource
    UserUtil userUtil;

    @Resource
    CommonUtil commonUtil;

    public SysPara initSysPara(String ddTenantId){
        if (commonUtil.getUseToken().equalsIgnoreCase("yes")){
            User user = userUtil.getUser(new User().setDdTenantId(ddTenantId).setEmployeeId(commonUtil.getEmployeeId()));
            return new SysPara(user.getUserId(), user.getEmployeeName(), user.getUserPassword(), user.getEmployeeId(), user.getEmployeeName(), user.getAccessToken());
        }
        return new SysPara();
    }

    public SysPara initSysPara(String ddTenantId,String entityName){
        if (commonUtil.getUseToken().equalsIgnoreCase("yes")){
            User user = userUtil.getUser(new User().setDdTenantId(ddTenantId).setEmployeeId(commonUtil.getEmployeeId()));
            return new SysPara(user.getUserId(), user.getEmployeeName(), user.getUserPassword(), user.getEmployeeId(), user.getEmployeeName(), user.getAccessToken(),entityName);
        }
        return new SysPara();
    }

}
