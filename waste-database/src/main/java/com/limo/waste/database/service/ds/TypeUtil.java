package com.limo.waste.database.service.ds;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author limo
 * @Date 2024/7/22 14:04
 * @Description:
 */
@Component
public class TypeUtil {

    public String toSqlType(Class<?> javaType,Integer length,Integer point) {
        if (javaType == null) {
            throw new IllegalArgumentException("Java type cannot be null");
        }
        if (point == null){
            point = 0;
        }
        if (length == null){
            length = 10;
        }
        if (javaType.equals(String.class)) {
            return "VARCHAR("+length+")";
        } else if (javaType.equals(Integer.class) || javaType.equals(int.class)) {
            return "INT";
        } else if (javaType.equals(Long.class) || javaType.equals(long.class)) {
            return "BIGINT";
        }else if (javaType.equals(Float.class) || javaType.equals(float.class)) {
            return "FLOAT("+length+","+point+")";
        }else if (javaType.equals(Boolean.class) || javaType.equals(boolean.class)) {
            return "VARCHAR(10)";
        }else if (javaType.equals(BigDecimal.class)) {
            return "DECIMAL("+length+","+point+")";
        }else if (javaType.equals(Double.class) || javaType.equals(double.class)) {
            return "DOUBLE("+length+","+point+")";
        }else if (javaType.equals(java.sql.Date.class)) {
            return "DATE";
        }else if (javaType.equals(Date.class)) {
            return "DATETIME";
        }else if (javaType.equals(Time.class)) {
            return "TIME";
        }else if (javaType.equals(Timestamp.class)) {
            return "TIMESTAMP";
        }
        // ... 为其他Java类型添加映射
        throw new IllegalArgumentException("Unsupported Java type: " + javaType.getName());
    }

}
