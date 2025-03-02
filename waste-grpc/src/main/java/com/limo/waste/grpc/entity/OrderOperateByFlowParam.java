package com.limo.waste.grpc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author limo
 * @Date 2024/7/30 14:04
 * @Description: 单据操作（走流程）参数
 */
@Accessors(chain = true)
@Data
public class OrderOperateByFlowParam {
    /**
     * 单据类型
     * */
    private String billTypeId;
    private String billTypeName;
    /**
     * 操作号
     * */
    private String operateType;
    /**
     * 登录用户
     * */
    private String userId;
    private String userName;
    private String accessToken;
    private String appKey;
    private String secret;
    /**
     * 租户
     * */
    private String tenantId;
    /**
     * 仓库
     * */
    private String wareHouseId;
    /**
     * 单头
     * */
    private String billJson;
    /**
     * 明细
     * */
    private String billItemJson;

}
