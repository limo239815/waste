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

    /**
     * 获取用户
     * */
    public User getUser(User query){
        User user = new User();
        CommonQueryParam param = new CommonQueryParam();
        SysPara sysPara = new SysPara().getSysPara(query.getDdTenantId(), query.getClass().getSimpleName());
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
     * */
    public Warehouse getWarehouse(String ddTenantId){
        Warehouse warehouse = new Warehouse();
        CommonQueryParam param = new CommonQueryParam();
        SysPara sysPara = new SysPara().getSysPara(ddTenantId, Warehouse.class.getSimpleName());
        param.setSysPara(sysPara);
        Map<String, Object> userPara = new HashMap<>();
        userPara.put("ddTenantId", ddTenantId);
        param.setUserPara(userPara);
        AddPara addPara = new AddPara();
        param.setAddPara(addPara);
        CommonQueryResult resultQuery = commonQueryService.queryAll(param);
        if (resultQuery != null && !CollectionUtils.isEmpty(resultQuery.getRows())) {
            for (Map<String, Object> data : resultQuery.getRows()) {
                warehouse = JSON.parseObject(new Gson().toJson(data), Warehouse.class);
                warehouse.setDdTenantId(ddTenantId);
            }
        }
        return warehouse;
    }

}
