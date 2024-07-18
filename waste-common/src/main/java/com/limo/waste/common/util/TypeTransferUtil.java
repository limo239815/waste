package com.limo.waste.common.util;

import org.springframework.stereotype.Component;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.*;

/**
 * @Author limo
 *
 * @Description: 类型转换工具
 */
@Component
public class TypeTransferUtil {

    public static <T> Map<String, Object> toMap(T entity) {
        Map<String, Object> map = new HashMap<>();
        if (entity == null) {
            return map;
        }

        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[0];
        try {
            propertyDescriptors = Introspector.getBeanInfo(entity.getClass(), Object.class)
                    .getPropertyDescriptors();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }

        for (PropertyDescriptor pd : propertyDescriptors) {
            String propertyName = pd.getName();
            if (!"class".equals(propertyName)) {
                try {
                    map.put(propertyName, pd.getReadMethod().invoke(entity));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return map;
    }
    public static <T> List<Map<String, Object>> toMapList(List<T> entityList) {
        List<Map<String, Object>> mapList = new ArrayList<>();
        if (entityList == null) {
            return mapList;
        }
        for (T entity:entityList) {
            mapList.add(toMap(entity));
        }
        return mapList;
    }

    public static String camelToSnake(String camelCase) {
        if (camelCase == null || camelCase.isEmpty()) {
            return camelCase;
        }

        StringBuilder snakeCase = new StringBuilder();
        for (int i = 0; i < camelCase.length(); i++) {
            char c = camelCase.charAt(i);
            if (Character.isUpperCase(c)) {
                if (i > 0) {
                    snakeCase.append('_');
                }
                snakeCase.append(Character.toLowerCase(c));
            } else {
                snakeCase.append(c);
            }
        }
        return snakeCase.toString();
    }

    /**
     * 将字符串分割后放入set中
     */
    public static Set<String> stringToSet(String value, String SplitStr) {
        return new HashSet<>(Arrays.asList(value.split(",")));
    }
}
