package com.limo.waste.grpc.util;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.limo.waste.grpc.entity.*;
import com.limo.waste.grpc.service.CommonQueryService;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author limo
 * @Date 2024/7/23 14:24
 * @Description: 用户工具
 */
@Component
public class UserUtil {

    @Resource
    CommonQueryService commonQueryService;

    @Resource
    SysParaUtil sysParaUtil;

    @Resource
    CommonUtil commonUtil;

    /**
     * 获取用户
     */
    public User getUser(User query) {
        return initUser(query);
    }

    private User initUser(User query){
        User user = new User();
        CommonQueryParam param = new CommonQueryParam();
        SysPara sysPara = new SysPara(query.getDdTenantId(), query.getClass().getSimpleName());
        param.setSysPara(sysPara);
        Map<String, Object> userPara = new HashMap<>();
        userPara.put("ddTenantId", query.getDdTenantId());
        if (StringUtils.hasLength(query.getEmail())) {
            userPara.put("email", query.getEmail());
        }
        if (StringUtils.hasLength(query.getPhone())) {
            userPara.put("phone", query.getPhone());
        }
        if (StringUtils.hasLength(query.getEmployeeId())) {
            userPara.put("employeeId", query.getEmployeeId());
        }
        if (StringUtils.hasLength(query.getEmployeeName())) {
            userPara.put("employeeName", query.getEmployeeName());
        }
        if (StringUtils.hasLength(query.getUserId())) {
            userPara.put("userId", query.getUserId());
        }
        param.setUserPara(userPara);
        AddPara addPara = new AddPara();
        param.setAddPara(addPara);
        CommonQueryResult resultQuery = commonQueryService.queryAll(param);
        if (resultQuery != null && !CollectionUtils.isEmpty(resultQuery.getRows())) {
            for (Map<String, Object> data : resultQuery.getRows()) {
                user = JSON.parseObject(new Gson().toJson(data), User.class);
                user.setDdTenantId(query.getDdTenantId());
            }
        }
        return user;
    }

    /**
     * 获取用户
     */
    private WareHouse getWarehouse(String ddTenantId) {
        WareHouse warehouse = new WareHouse();
        CommonQueryParam param = new CommonQueryParam();
        SysPara sysPara = sysParaUtil.initSysPara(ddTenantId, WareHouse.class.getSimpleName());
        param.setSysPara(sysPara);
        Map<String, Object> userPara = new HashMap<>();
        userPara.put("ddTenantId", ddTenantId);
        param.setUserPara(userPara);
        AddPara addPara = new AddPara();
        param.setAddPara(addPara);
        CommonQueryResult resultQuery = commonQueryService.queryAll(param);
        if (resultQuery != null && !CollectionUtils.isEmpty(resultQuery.getRows())) {
            for (Map<String, Object> data : resultQuery.getRows()) {
                warehouse = JSON.parseObject(new Gson().toJson(data), WareHouse.class);
                warehouse.setDdTenantId(ddTenantId);
                break;
            }
        }
        return warehouse;
    }

    private UserLogin initUserLogin(String ddTenantId, String employeeId) {
        if (!StringUtils.hasLength(ddTenantId)) {
            ddTenantId = commonUtil.getDefaultDdTenantId();
        }
        if (commonUtil.getUseToken().equalsIgnoreCase("yes")) {
            User user;
            if (StringUtils.hasLength(employeeId)) {
                user = getUser(new User().setEmployeeId(employeeId).setDdTenantId(ddTenantId));
            } else {
                user = getUser(new User().setEmployeeId(commonUtil.getEmployeeId()).setDdTenantId(ddTenantId));
            }
            WareHouse warehouse = getWarehouse(ddTenantId);
            return new UserLogin(ddTenantId, user.getUserId(), user.getEmployeeName(), user.getAccessToken(), warehouse.getWareHouseId(), warehouse.getWareHouseName());
        }
        return new UserLogin(ddTenantId);
    }

    public UserLogin initUserLogin(String ddTenantId) {
        return initUserLogin(ddTenantId, "");
    }


}
