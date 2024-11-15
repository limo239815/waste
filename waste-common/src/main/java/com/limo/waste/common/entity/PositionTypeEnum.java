package com.limo.waste.common.entity;


public enum PositionTypeEnum {

    /**
     * 存储工位
     * */
    STORAGE("S"),
    /**
     * 传输工位
     * */
    TRANSFER("T"),
    /**
     * 出入库口
     * */
    IN_OR_OUT("F"),
    /**
     * 拣选工位
     * */
    PICKING("P"),
    /**
     * 充电工位
     * */
    CHARGING("C"),
    /**
     * 提升机工位
     * */
    LIFT("E"),
    /**
     * 异常工位
     * */
    ABNORMAL("A"),
    MA("M"),
    ;
    private final String code;

    PositionTypeEnum(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
