package com.limo.waste.grpc.util.enumeration;

/**
 * @author
 * @date
 * @description 托盘类型枚举
 */
public enum ContainerTypeEnum {
    /**
     * 托盘
     * */
    TUO_PAN("containerType01"),
    /**
     * 料箱
     * */
    LIAO_BOX("containerType02"),
    /**
     * 原箱
     * */
    YUAN_BOX("containerType03"),
    /**
     * 出库箱
     * */
    CHU_KU_BOX("containerType04"),
    /**
     * 盒
     * */
    HE("containerType05"),
    ;
    private final String code;

    ContainerTypeEnum(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
