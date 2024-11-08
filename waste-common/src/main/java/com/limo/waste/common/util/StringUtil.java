package com.limo.waste.common.util;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * @author chenwenwen
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

}
