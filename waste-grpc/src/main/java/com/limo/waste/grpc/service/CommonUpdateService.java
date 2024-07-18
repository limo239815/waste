package com.limo.waste.grpc.service;


import com.limo.waste.common.util.Result;
import com.limo.waste.grpc.entity.UserLogin;

import java.util.List;
import java.util.Map;

/**
 * @Author
 *
 * @Description
 */
public interface CommonUpdateService {

    /**
     * @param tag 标识 是否更新不到报错 1：是
     * */
    Result<Boolean> update(String tag, String currUuid, String entityName, String ddTenantId, String sql);
    Result<Boolean> update(String currUuid,String entityName, String ddTenantId, String sql);
    Result<Boolean> commitByBillService(UserLogin userLogin);

    Result<String> commonSaveBillService(String billTypeId,Map<String, Object> order,Map<String, List<Map<String, Object>>> orderItem,UserLogin userLogin);
    Result<Boolean> commonDeleteBillService(String billTypeId,String billId, UserLogin userLogin);
    /**
     * 自动送审
     *
     * @param ddTenantId   租户
     * @param billIds      单号集
     * @param billTypeId   单据类型
     * @param billTypeName 单据类型名称
     */
    Result<Boolean> autoSendAudit(String msgId, String ddTenantId, List<String> billIds, String billTypeId, String billTypeName);

    /**
     * 撤销执行
     *
     * @param ddTenantId   租户
     * @param billIds      单号集
     * @param billTypeId   单据类型
     * @param billTypeName 单据类型名称
     */
    Result<Boolean> unCheck(String msgId, String ddTenantId, List<String> billIds, String billTypeId, String billTypeName);

    /**
     * 单据删除
     *
     * @param ddTenantId   租户
     * @param billId       单号
     * @param billTypeId   单据类型
     * @param billTypeName 单据类型名称
     * @param billJson     单据主体
     */
    Result<Boolean> orderDelete(String msgId, String ddTenantId, String billId, String billTypeId, String billTypeName, Map<String, Object> billJson, String itemEntityId, List<Map<String, Object>> billJsonItem);

    /**
     * 单据删除
     *
     * @param ddTenantId 租户
     * @param billIds    单号集
     * @param billTypeId 单据类型
     */
    Result<Boolean> orderDelete(boolean commit, String currUuid, String ddTenantId, List<String> billIds, String billTypeId);

    /**
     * 单据修改
     *
     * @param tag        是否更新不到报错 1是
     * @param entityName 实体
     * @param ddTenantId 租户
     * @param sqlList    sql集
     */
    Result<Boolean> orderUpdate(boolean commit, String currUuid, String tag, String entityName, String ddTenantId, List<String> sqlList);

    /**
     * 单据保存
     *
     * @param entityId          头档实体
     * @param itemEntityId      明细实体
     * @param ddTenantId        租户
     * @param mapWorkOrder      头档
     * @param listWorkOrderItem 明细
     * @param initStatus        是否初始化状态
     */
    Result<String> orderSaveReturnPrimaryKey(String entityId, String itemEntityId, String ddTenantId, Map<String, Object> mapWorkOrder, List<Map<String, Object>> listWorkOrderItem, boolean initStatus);
    /**
     * 单据保存
     *
     * @param entityId          头档实体
     * @param itemEntityId      明细实体
     * @param ddTenantId        租户
     * @param mapWorkOrder      头档
     * @param listWorkOrderItem 明细
     * @param initStatus        是否初始化状态
     */
    Result<Boolean> orderSave(String entityId, String itemEntityId, String ddTenantId, Map<String, Object> mapWorkOrder, List<Map<String, Object>> listWorkOrderItem, boolean initStatus);
}
