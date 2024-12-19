package com.limo.waste.common.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * @author
 * @Date 2024/6/15 15:58
 * @Description: 字符串工具包
 */
public class StringUtil {

    private final char[] value;

    public StringUtil(String str) {
        this.value = str.toLowerCase(Locale.ROOT).toCharArray();
    }

    public StringUtil(char[] value) {
        this.value = value.clone();
    }

    public int indexOf(char ch) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == ch) {
                return i;
            }
        }
        return -1;
    }
    //忽略大小写
    public int indexOf(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        char[] target = str.toCharArray();
        int targetLen = target.length;

        for (int i = 0; i <= value.length - targetLen; i++) {
            int j = 0;
            while (j < targetLen && value[i + j] == target[j]) {
                j++;
            }
            if (j == targetLen) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return new String(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StringUtil) {
            StringUtil other = (StringUtil) obj;
            return java.util.Arrays.equals(this.value, other.value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Arrays.hashCode(value);
    }


    public static boolean containAll(String value1,String value2,String split){
        List<String> values1 = Arrays.asList(value1.split(split));
        List<String> values2 = Arrays.asList(value2.split(split));
        return values1.containsAll(values2);
    }

    public static boolean hasField(String fieldName,Class<?> clazz) throws NoSuchFieldException{
        // 判断字段是否存在
        boolean fieldExists = false;
        try {
            Field field = clazz.getDeclaredField(fieldName);
            fieldExists = true;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return fieldExists;
    }
    public static  <T> String hasFieldReturn(String fieldName,T entity) throws NoSuchFieldException, IllegalAccessException {
        String result;
        // 判断字段是否存在
        Class<?> clazz = entity.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        // 设置可访问性（如果字段是私有的）
        field.setAccessible(true);

        // 返回字段的值
        result = (String) field.get(entity);
        return result;
    }
    public static List<String> getSameItems(String s1, String s2, String regex){
        List<String> l1 = Arrays.asList(s1.split(regex));
        List<String> l2 = Arrays.asList(s2.split(regex));
        l1.retainAll(l2);
        return l1;
    }
    public static <T> List<T> getSameItems(List<T> l1, List<T> l2){
        List<T> newList = new ArrayList<>(l1);
        newList.retainAll(l2);
        return newList;
    }
    public static boolean containsAll(String s1, String s2, String regex){
        List<String> l1 = Arrays.asList(s1.split(regex));
        List<String> l2 = Arrays.asList(s2.split(regex));
        return l1.containsAll(l2);
    }
}
