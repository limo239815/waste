package com.limo.waste.common.util;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenwenwen
 * @version V1.0.0
 * @Date 2023/5/10 17:23
 * @Description 返回值数据转换
 */
public class DataUtil {

    private final static String LIST_KEY = "rows";

    public static <T> Map<String,List<T>> toMap(List<T> data){
        Map<String,List<T>> result = new HashMap<>();
        result.put(LIST_KEY,data);
        return result;
    }
}
