package com.limo.waste.grpc.util.enumeration;

/**
 * @Author
 * @Date
 * @Description: 表达式枚举
 */
public enum QueryExpressionEnum {

    FROM_TO("fromto","大于等于，小于等于"),
    IN_OR_LIKE("contains","包含"),
    ;

    private final String code;
    private final String desc;

    QueryExpressionEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
