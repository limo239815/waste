package com.limo.waste.grpc.util.enumeration;

/**
 * @author
 * @date
 * @description 工作台类型枚举
 */
public enum WorkLocationTypeEnum {
    /**
     * 入库
     * */
    IN("workLocationType01"),
    /**
     * 出库
     * */
    OUT("workLocationType02"),
    /**
     * 盘点
     * */
    CHECK_INVENTORY("workLocationType03"),
    EXCEPTION("workLocationType04"),
    ;
    private final String code;

    WorkLocationTypeEnum(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
