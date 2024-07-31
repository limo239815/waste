package com.limo.waste.grpc.service.impl;

import bill.service.v1.billGrpc;
import com.github.benmanes.caffeine.cache.Cache;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.limo.waste.common.util.*;
import com.limo.waste.grpc.service.CommonQueryService;
import com.limo.waste.grpc.service.CommonUpdateService;
import com.limo.waste.grpc.entity.*;
import com.limo.waste.grpc.util.*;
import com.limo.waste.grpc.util.messagebus.MessageBusEnum;
import com.limo.waste.grpc.util.messagebus.SendMessageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author
 * @Date 2023/7/7 9:47
 * @Description 通用更新服务
 */
@Service
@Slf4j
public class CommonUpdateServiceImpl implements CommonUpdateService {

    @Resource
    billGrpc.billBlockingStub billService;

    @Resource
    CommonQueryService commonQueryService;

    @Resource
    RedisService redisService;

    @Resource
    Cache<String, String> cacheManagerForWaste;

    @Resource
    SendMessageUtil sendMessageUtil;

    @Resource
    HttpUtil httpUtil;

    @Resource
    SysParaUtil sysParaUtil;

    @Resource
    UserUtil userUtil;

    @Resource
    CommonUpdateParamUtil commonUpdateParamUtil;

    @Resource
    CommonUtil commonUtil;

    @Override
    public Result<Boolean> update(String tag, String currUuid, String entityName, String ddTenantId, String sql) {
        try {
            //获取组别
            String key = "";
            if (cacheManagerForWaste.asMap().containsKey(entityName + ddTenantId)) {
                key = cacheManagerForWaste.asMap().get(entityName + ddTenantId);
            } else {
                CommonQueryParam param = new CommonQueryParam();
                param.setSysPara(sysParaUtil.initSysPara(ddTenantId, "BusinessEntity"));
                Map<String, Object> userPara = new HashMap<>();
                userPara.put("entityId", entityName);
                userPara.put("ddTenantId", ddTenantId);
                param.setUserPara(userPara);
                List<String> fieldList = new ArrayList<>();
                fieldList.add("entityGroup");
                param.setAddPara(new AddPara().setFieldList(fieldList));
                CommonQueryResult result = commonQueryService.queryAll(param);
                if (result == null) {
                    return Result.fail(Result.FAIL_CODE, "未获取到实体组");
                }
                if (result.getResponseMessage().equals("error")) {
                    return Result.fail(Result.FAIL_CODE, result.getErrorMessage());
                }
                if (CollectionUtils.isEmpty(result.getRows())) {
                    return Result.fail(Result.FAIL_CODE, "实体组不存在");
                }
                for (Map<String, Object> entity : result.getRows()) {
                    if (entity.get("entityGroup") == null || entity.get("entityGroup").equals("")) {
                        return Result.fail(Result.FAIL_CODE, "实体组别不存在");
                    }
                    key = (String) entity.get("entityGroup");
                }
            }
            Map<String, Object> value = new HashMap<>();
            if (tag.equals("1")) {
                value.put(key + ":", sql);
            } else {
                value.put(key, sql);
            }
            //保留原始字段不转义
            Gson gson = new GsonBuilder().disableHtmlEscaping().create();
            log.info("更新：{}【{}】", currUuid, value);
            redisService.lPush(currUuid, gson.toJson(value));
            return Result.success();
        } catch (Exception e) {
            return Result.fail(Result.FAIL_CODE, e.getMessage());
        }
    }

    @Override
    public Result<Boolean> update(String currUuid, String entityName, String ddTenantId, String sql) {
        return update("", currUuid, entityName, ddTenantId, sql);
    }

    public Result<Boolean> commitByBillService(UserLogin userLogin) {
        //调用go服务执行sql CommitOperateReq
        bill.service.v1.CommitOperateReq reqParam = bill.service.v1.CommitOperateReq.newBuilder().setUserLogin(new Gson().toJson(userLogin)).build();
        log.info("更新参数：{}", reqParam);
        bill.service.v1.CommitOperateResp resp = billService.commitOperate(reqParam);
        if (resp.getResponseMessage().equals("success")) {
            log.info("更新完成");
            return Result.success();
        }
        log.error("更新失败：{}", resp.getErrorMessage());
        return Result.fail(Result.FAIL_CODE, resp.getErrorMessage());
    }

    @Override
    public Result<String> commonSaveBillService(String billTypeId, Map<String, Object> order, Map<String, List<Map<String, Object>>> orderItem, UserLogin userLogin) {
        String billJson = new Gson().toJson(order);
        String billItemJson = "{}";
        if (!CollectionUtils.isEmpty(orderItem)) {
            billItemJson = new Gson().toJson(orderItem);
        }
        String userLoginStr = new Gson().toJson(userLogin);
        bill.service.v1.SaveBillReq saveBillReq = bill.service.v1.SaveBillReq.newBuilder()
                .setBillJson(billJson)
                .setBillItemJson(billItemJson)
                .setBillTypeId(billTypeId)
                .setEdStatus(OperateTypeEnum.CREATE.getCode())
                .setUserLogin(userLoginStr)
                .build();
        bill.service.v1.SaveBillResp saveBillResp = billService.commonSaveBillV2(saveBillReq);
        log.info("请求commonSaveBillV2结果：{}", new Gson().toJson(saveBillResp));
        if (saveBillResp.getResponseMessage().equals("error")) {
            return Result.fail(Result.FAIL_CODE, saveBillResp.getErrorMessage());
        }
        return Result.success(saveBillResp.getResultBillId());
    }

    public Result<Boolean> commonDeleteBillService(String billTypeId, String billId, UserLogin userLogin) {
        String userLoginStr = new Gson().toJson(userLogin);
        bill.service.v1.DeleteBillReq deleteBillReq = bill.service.v1.DeleteBillReq.newBuilder()
                .setBillId(billId)
                .setBillTypeId(billTypeId)
                .setUserLogin(userLoginStr)
                .build();
        bill.service.v1.DeleteBillResp deleteBillResp = billService.commonDeleteBillV2(deleteBillReq);
        log.info("请求commonDeleteBillV2结果：{}", new Gson().toJson(deleteBillResp));
        if (deleteBillResp.getResponseMessage().equals("error")) {
            return Result.fail(Result.FAIL_CODE, deleteBillResp.getErrorMessage());
        }
        return Result.success();
    }

    @Override
    public Result<Boolean> autoSendAudit(String msgId, String ddTenantId, List<String> billIds, String billTypeId, String billTypeName) {
        List<Map<String, Object>> billIdList = new ArrayList<>();
        for (String billId : billIds) {
            Map<String, Object> billIdMap = new HashMap<>();
            billIdMap.put("keyValue", billId);
            billIdMap.put("key", "orderId");
            billIdList.add(billIdMap);
        }
        String billIdStr = new Gson().toJson(billIdList);
        CommonUpdateParam autoCheckParam = commonUpdateParamUtil.initCommonUpdateParam(ddTenantId, billTypeId, billTypeName, OperateTypeEnum.BATCH_SEND_CHECK.getKey());
        autoCheckParam.setBillIds(billIdStr)
                .setBillId("")
                .setBillItemJson("N")
                .setBillJson("N");
        return sendMessageUtil.send(MessageBusEnum.AUTO_CHECK, msgId, new Gson().toJson(autoCheckParam));
    }

    @Override
    public Result<Boolean> unCheck(String msgId, String ddTenantId, List<String> billIds, String billTypeId, String billTypeName) {
        List<Map<String, Object>> billIdList = new ArrayList<>();
        for (String billId : billIds) {
            Map<String, Object> billIdMap = new HashMap<>();
            billIdMap.put("keyValue", billId);
            billIdMap.put("key", "orderId");
            billIdList.add(billIdMap);
        }
        String billIdStr = new Gson().toJson(billIdList);
        CommonUpdateParam autoCheckParam = commonUpdateParamUtil.initCommonUpdateParam(ddTenantId, billTypeId, billTypeName, OperateTypeEnum.UNCHECK.getKey());
        autoCheckParam.setBillIds(billIdStr)
                .setBillId("")
                .setBillItemJson("N")
                .setBillJson("N");
        return sendMessageUtil.send(MessageBusEnum.AUTO_CHECK, msgId, new Gson().toJson(autoCheckParam));
    }

    @Override
    public Result<Boolean> orderDelete(String msgId, String ddTenantId, String billId, String billTypeId, String billTypeName, Map<String, Object> billJson, String itemEntityId, List<Map<String, Object>> billJsonItem) {
        String billItemJson = "{}";
        Map<String, List<Map<String, Object>>> mapWorkOrderItem = new HashMap<>();
        if (StringUtils.hasLength(itemEntityId)) {
            mapWorkOrderItem.put(itemEntityId, billJsonItem);
            billItemJson = new Gson().toJson(mapWorkOrderItem);
        }
        CommonUpdateParam autoCheckParam = commonUpdateParamUtil.initCommonDeleteParam(ddTenantId, billTypeId, billTypeName, OperateTypeEnum.DELETE.getKey());
        autoCheckParam.setBillIds("[]")
                .setBillId(billId)
                .setBillItemJson(billItemJson)
                .setBillJson(new Gson().toJson(billJson));
        return sendMessageUtil.send(MessageBusEnum.AUTO_CHECK, msgId, new Gson().toJson(autoCheckParam));
    }

    @Override
    public Result<Boolean> orderDelete(boolean commit, String currUuid, String ddTenantId, List<String> billIds, String billTypeId) {
        UserLogin userLogin = userUtil.initUserLogin(ddTenantId);
        if (!StringUtils.hasLength(currUuid)) {
            currUuid = IDUtils.getUuid("location:");
        }
        userLogin.setCurrUuid(currUuid);
        for (String billId : billIds) {
            Result<Boolean> result = commonDeleteBillService(billTypeId, billId, userLogin);
            if (Result.FAIL_CODE.equals(result.getResultCode())) {
                log.error("单据删除失败：{}，单据类型：{}，单号：{}", result.getResultMessage(), billTypeId, billId);
                return result;
            }
        }
        if (commit) {
            return commitByBillService(userLogin);
        }
        return Result.success();
    }

    @Override
    public Result<Boolean> orderUpdate(boolean commit, String currUuid, String tag, String entityName, String ddTenantId, List<String> sqlList) {
        if (CollectionUtils.isEmpty(sqlList)) {
            return Result.success();
        }
        UserLogin userLogin = userUtil.initUserLogin(ddTenantId);
        if (!StringUtils.hasLength(currUuid)) {
            currUuid = IDUtils.getUuid("location:");
        }
        userLogin.setCurrUuid(currUuid);
        for (String sql : sqlList) {
            Result<Boolean> result = update(tag, currUuid, entityName, ddTenantId, sql);
            if (Result.FAIL_CODE.equals(result.getResultCode())) {
                return result;
            }
        }
        if (commit) {
            return commitByBillService(userLogin);
        }
        return Result.success();
    }

    @Override
    public Result<String> orderSaveReturnPrimaryKey(String entityId, String itemEntityId, String ddTenantId, Map<String, Object> mapWorkOrder, List<Map<String, Object>> listWorkOrderItem, boolean initStatus) {
        UserLogin userLogin = userUtil.initUserLogin(ddTenantId);
        String currUuid = IDUtils.getUuid("location:");
        userLogin.setCurrUuid(currUuid);
        mapWorkOrder.put("userId", userLogin.getUserLoginId());
        mapWorkOrder.put("userName", userLogin.getUserLoginName());
        mapWorkOrder.put("operateUserId", userLogin.getUserLoginId());
        mapWorkOrder.put("operateUserName", userLogin.getUserLoginName());
        Map<String, List<Map<String, Object>>> mapWorkOrderItem = new HashMap<>();
        if (StringUtils.hasLength(itemEntityId)) {
            mapWorkOrderItem.put(itemEntityId, listWorkOrderItem);
        }
        Result<String> ResultForSave = commonSaveBillService(entityId, mapWorkOrder, mapWorkOrderItem, userLogin);
        if (Result.FAIL_CODE.equals(ResultForSave.getResultCode())) {
            return Result.fail(Result.FAIL_CODE, ResultForSave.getResultMessage());
        }
        if (initStatus) {
            String[] value = ResultForSave.getResultValue().split(":");
            String updateSql = "update " + TypeTransferUtil.camelToSnake(entityId) + " set status_id='INIT',status_name='草稿' where " + TypeTransferUtil.camelToSnake(value[0]) + "='" + value[1] + "' and dd_tenant_id='" + ddTenantId + "'";
            Result<Boolean> result = update(currUuid, entityId, ddTenantId, updateSql);
            if (Result.FAIL_CODE.equals(result.getResultCode())) {
                return Result.fail(Result.FAIL_CODE, result.getResultMessage());
            }
        }
        Result<Boolean> result = commitByBillService(userLogin);
        if (Result.FAIL_CODE.equals(result.getResultCode())) {
            return Result.fail(Result.FAIL_CODE, result.getResultMessage());
        }
        return Result.success(ResultForSave.getResultValue());
    }

    @Override
    public Result<Boolean> orderSave(String entityId, String itemEntityId, String ddTenantId, Map<String, Object> mapWorkOrder, List<Map<String, Object>> listWorkOrderItem, boolean initStatus) {
        UserLogin userLogin = userUtil.initUserLogin(ddTenantId);
        String currUuid = IDUtils.getUuid("location:");
        userLogin.setCurrUuid(currUuid);
        mapWorkOrder.put("userId", userLogin.getUserLoginId());
        mapWorkOrder.put("userName", userLogin.getUserLoginName());
        mapWorkOrder.put("operateUserId", userLogin.getUserLoginId());
        mapWorkOrder.put("operateUserName", userLogin.getUserLoginName());
        Map<String, List<Map<String, Object>>> mapWorkOrderItem = new HashMap<>();
        if (StringUtils.hasLength(itemEntityId)) {
            mapWorkOrderItem.put(itemEntityId, listWorkOrderItem);
        }
        Result<String> ResultForSave = commonSaveBillService(entityId, mapWorkOrder, mapWorkOrderItem, userLogin);
        if (Result.FAIL_CODE.equals(ResultForSave.getResultCode())) {
            return Result.fail(Result.FAIL_CODE, ResultForSave.getResultMessage());
        }
        if (initStatus) {
            String[] value = ResultForSave.getResultValue().split(":");
            String updateSql = "update " + TypeTransferUtil.camelToSnake(entityId) + " set status_id='INIT',status_name='草稿' where " + TypeTransferUtil.camelToSnake(value[0]) + "='" + value[1] + "' and dd_tenant_id='" + ddTenantId + "'";
            Result<Boolean> result = update(currUuid, entityId, ddTenantId, updateSql);
            if (Result.FAIL_CODE.equals(result.getResultCode())) {
                return Result.fail(Result.FAIL_CODE, result.getResultMessage());
            }
        }
        return commitByBillService(userLogin);
    }

    @Override
    public <H,I> Result<Boolean> orderSaveByFlow(OrderOperateParam<H,I> order) {
        Map<String,Object> billItemJson = new HashMap<>();
        billItemJson.put(order.getItemEntityId(),TypeTransferUtil.toMapList(order.getItems()));
        UserLogin userLogin = userUtil.initUserLogin(order.getDdTenantId());
        OrderOperateByFlowParam param = new OrderOperateByFlowParam()
                .setBillTypeId(order.getBillTypeId())
                .setBillTypeName(order.getBillTypeName())
                .setOperateType(OperateTypeEnum.CREATE.getKey())
                .setUserId(userLogin.getUserLoginId())
                .setUserName(userLogin.getUserLoginName())
                .setAccessToken(userLogin.getAccessToken())
                .setAppKey(userLogin.getAppKey())
                .setSecret(userLogin.getSecret())
                .setTenantId(StringUtils.hasLength(order.getDdTenantId())?order.getDdTenantId():commonUtil.getDefaultDdTenantId())
                .setWareHouseId(userLogin.getWareHouseId())
                .setBillJson(new Gson().toJson(TypeTransferUtil.toMap(order.getBill())))
                .setBillItemJson(new Gson().toJson(billItemJson));
        Result<?> result = httpUtil.postForBill(commonUtil.getGoUrl(),new Gson().toJson(param));
        if (Result.FAIL_CODE.equals(result.getResultCode())){
            return Result.fail(result.getResultCode(),result.getResultMessage());
        }
        return Result.success();
    }
}
