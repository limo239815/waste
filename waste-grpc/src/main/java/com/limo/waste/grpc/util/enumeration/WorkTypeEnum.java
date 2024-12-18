package com.limo.waste.grpc.util.enumeration;

import java.util.Arrays;

/**
 * @author
 * @date
 * @description 工作台出入类型枚举
 */
public enum WorkTypeEnum {

    /**
     * 零散
     * */
    SCATTERED("scattered","零散"),
    /**
     * 整托
     * */
    WHOLE_CONTAINER("wholeContainer","整托"),

    OTHER("other","未知类型"),
    ;


    private final String code;

    private final String name;

    WorkTypeEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getName(String code){
        return Arrays.stream(WorkTypeEnum.values()).filter(workTypeEnum -> workTypeEnum.getCode().equals(code))
                .findFirst().orElse(WorkTypeEnum.OTHER).getName();
    }
}
