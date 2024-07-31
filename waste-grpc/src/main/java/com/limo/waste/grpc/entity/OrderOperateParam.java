package com.limo.waste.grpc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Author limo
 * @Date 2024/7/30 14:54
 * @Description: 单据流程操作参数
 */
@Accessors(chain = true)
@Data
public class OrderOperateParam<H,I> {

    /**
     * 单据类型
     * */
    private String billTypeId;
    private String billTypeName;
    /**
     * 租户
     * */
    private String ddTenantId;
    /**
     * 头实体
     * */
    private String entityId;
    /**
     * 明细实体
     * */
    private String itemEntityId;

    /**
     * 单头
     * */
    private H bill;
    /**
     * 明细
     * */
    private List<I> items;

}
