package com.limo.waste.common.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author chenwenwen
 * @date 2023/7/15 16:15
 * @description 储位
 */
@Data
@Accessors(chain = true)
public class Position {

    private String positionId;
    private String positionName;
    /**
     * 工作台编号
     */
    private String workLoctionId;
    /**
     * 工作台名称
     */
    private String workLoctionName;
    /**
     * 点位类型 S：存储工位 T：传输工位 E：提升机 P：拣选工位 C：充电工位
     */
    private String positionTypeId;
    /**
     * 层
     */
    private Integer floor;
    /**
     * 横坐标
     */
    private Integer x;
    /**
     * 纵坐标
     */
    private Integer y;
    /**
     * 容器号
     */
    private String containerId;
    /**
     * 状态
     */
    private String isStop;
    /**
     * 状态
     */
    private String isStopName;
    /**
     * 排序
     */
    private String orderBy;
    /**
     * 偏移量
     */
    private Integer offset;
    /**
     * 当前页
     */
    private Integer page;
    /**
     * 每页条数
     */
    private Integer rows;
    /**
     * 租户
     */
    private String ddTenantId;
    /**
     * 优先级
     */
    private String priority;

    /**
     * 工作台是否已被本单预占
     */
    private boolean nowOrderId;
    /**
     * 使能
     */
    private String enabled;

    /**
     * 库房
     */
    private String storehouseId;
    private String storehouseName;

    public Position() {
    }

    public Position(String positionId, String positionTypeId, String priority) {
        this.positionId = positionId;
        this.positionTypeId = positionTypeId;
        this.priority = priority;
    }
}
