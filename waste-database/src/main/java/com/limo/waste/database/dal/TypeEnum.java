package com.limo.waste.database.dal;

import com.limo.waste.database.service.ds.TypeUtil;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @Author limo
 * @Date 2024/7/22 13:39
 * @Description: 类型枚举
 */
public enum TypeEnum {
    ID("id", new TypeUtil().toSqlType(String.class,20,0)),
    NAME("name", new TypeUtil().toSqlType(String.class,100,0)),
    ARTICLE("article",new TypeUtil().toSqlType(String.class,255,0)),
    DESCRIPTION("description",new TypeUtil().toSqlType(String.class,255,0)),
    CURRENCY_AMOUNT("currency-amount",new TypeUtil().toSqlType(BigDecimal.class,18,2)),
    NUMERIC("numeric",new TypeUtil().toSqlType(Integer.class,0,0)),
    DATE("date",new TypeUtil().toSqlType(java.sql.Date.class,0,0)),
    OTHER("",""),
    ;
    private final String code;

    private final String type;

    TypeEnum(String code,String type){
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getType(String code) {
        return Arrays.stream(TypeEnum.values()).filter(e -> e.getCode().equals(code))
                .findFirst().orElse(TypeEnum.OTHER).getType();
    }
}
