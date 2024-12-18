package com.limo.waste.grpc.util.enumeration;

/**
 * @author
 * @date
 * @description 工作站状态枚举
 */
public enum WorkLocStatusEnum {

    /**
     * 空闲
     * */
    FREE("free","空闲"),
    /**
     * 占用
     * */
    IN_USE("inUse","占用")
    ;
    private final String code;
    private final String name;

    WorkLocStatusEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
