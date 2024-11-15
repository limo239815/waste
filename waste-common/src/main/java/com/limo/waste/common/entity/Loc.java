package com.limo.waste.common.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Accessors(chain = true)
@Data
public class Loc implements Serializable {
    private static final long serialVersionUID=24031501L;
    /**
     * 库位
     * */
    private String locId;
    private String locName;
    /**
     * 库区
     * */
    private String zoneId;
    private String zoneName;
    /**
     * 仓库
     * */
    private String wareHouseId;
    private String wareHouseName;
    /**
     * 通道
     * */
    private String aisleId;
    private String aisleName;
    /**
     * 长
     * */
    private Integer length;
    /**
     * 宽
     * */
    private Integer width;
    /**
     * 高
     * */
    private Integer height;
    /**
     * 容器好
     * */
    private String containerId;
    /**
     * 是否停用 1 停用
     * */
    private String isStop;
    /**
     * 优先级
     * */
    private String priority;
    /**
     * x坐标
     * */
    private Integer x;
    /**
     * 表达式
     * */
    private String xExpression;
    /**
     * 表达式值
     * */
    private String xExpressionValue;
    /**
     * y坐标
     * */
    private Integer y;
    /**
     * 表达式
     * */
    private String yExpression;
    /**
     * 表达式值
     * */
    private String yExpressionValue;
    /**
     * 层
     * */
    private Integer floor;
    /**
     * rcs储位
     * */
    private String positionId;
    /**
     * 层
     * */
    private String floorId;
    private String floorName;
    /**
     * 库房
     * */
    private String storehouseId;
    private String storehouseName;
    /**
     * 储位类型编号
     * */
    private String positionTypeId;

    private String ddTenantId;

    private String orderBy;
    /**
     * 金蝶对应库存
     * */
    private String jdWareHouseId;
    private String jdWareHouseName;
    /**
     * 金蝶对应库位
     * */
    private String jdLocId;
    private String jdLocName;
    /**
     * 是否可达
     * */
    private String reachability;
    /**
     * 容器锁
     * */
    private String containerLock;
    /**
     * 放置空容器
     * */
    private String placeEmptyContainer;
    /**
     * 动态通道
     * */
    private String dynamicChannel;
    /**
     * 主要通道
     * */
    private String mainChannel;
    /**
     * 巷深
     * */
    private String deepLane;

    private Integer page;
    private Integer pageSize;
}
