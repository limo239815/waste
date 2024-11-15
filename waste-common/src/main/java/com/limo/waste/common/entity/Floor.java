package com.limo.waste.common.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author
 * @date
 * @description:
 */
@Accessors(chain = true)
@Data
public class Floor {
    /**
     * 库层
     * */
    private String floorId;
    private String floorName;
    /**
     * 备注
     * */
    private String memo;
    /**
     * 库区
     * */
    private String zoneId;
    private String zoneName;
    /**
     * 库房
     * */
    private String storehouseId;
    private String storehouseName;
    /**
     * 高度类型
     * */
    private String heightType;
    private String heightTypeName;
    /**
     * 预留通道数
     * */
    private int aisleQty;

    /**
     * 最大承重
     * */
    private BigDecimal maxWeight;
    /**
     * 规格(大/小)
     * */
    private String containerSpecId;
    private String containerSpecName;
    /**
     * 层
     * */
    private Integer floor;
    private String ddTenantId;

    private String orderBy;
}
