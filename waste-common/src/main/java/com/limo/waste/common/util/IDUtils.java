package com.limo.waste.common.util;

import com.github.benmanes.caffeine.cache.Cache;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author limo
 *
 * @Description id生成器
 */
@Component
public class IDUtils {

    @Resource
    Cache<String,Integer> cacheManagerForWaste;

    final String ID = "common";

    final String TASK_ID="task";
    /**
     * +时间戳
     * @param prefix 前缀
     * @param length 后缀长度
     * @return 前缀+年月日时分秒+累积后缀长度
     * */
    public String getCommonId(String prefix,int length){
        cacheManagerForWaste.asMap().putIfAbsent(ID, 1);
        SimpleDateFormat sf = new SimpleDateFormat("yyMMddHHmmss");
        int value = cacheManagerForWaste.asMap().get(ID)+1;
        if (value > 99){
            value = 1;
            cacheManagerForWaste.put(ID,1);
        }
        cacheManagerForWaste.put(ID,value);
        return prefix+sf.format(new Date())+intToString(value,length);
    }
    /**
     * 生成id
     * @return 时间+uuid
     * */
    public static String getId(){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String uuid = UUID.randomUUID().toString();
        return df.format(new Date())+uuid.substring(uuid.length()-5);
    }
    /**
     * 生成1-9999任务号
     * */
    public  int getTaskId(){
        if (!cacheManagerForWaste.asMap().containsKey(TASK_ID)){
            SimpleDateFormat df = new SimpleDateFormat("HHss");
            cacheManagerForWaste.put(TASK_ID,Integer.parseInt(df.format(new Date())));
        }
        int taskId = cacheManagerForWaste.asMap().get(TASK_ID);
        if (taskId > 9999){
            SimpleDateFormat df = new SimpleDateFormat("HHss");
            cacheManagerForWaste.put(TASK_ID,Integer.parseInt(df.format(new Date())));
            taskId = cacheManagerForWaste.asMap().get(TASK_ID);
        }
        return taskId;
    }
    /**
     * 获取uuid
     * @param prefix 前缀
     * @return 前缀+uuid
     * */
    public static String getUuid(String prefix){
        return prefix+ UUID.randomUUID();
    }

    public static String getUuid(String prefix,int length){
        return (prefix+ UUID.randomUUID()).substring(0,length);
    }
    public static String getUuid(int length){
        return String.valueOf(UUID.randomUUID()).substring(0,length);
    }


    /**
     * 数值转字符串
     * @param value 值
     * @param length 返回长度
     * */
    public static String intToString(int value,int length){
        StringBuilder result = new StringBuilder(String.valueOf(value));
        if (result.length() > length){
            return result.substring(0,length);
        }
        int x = length-result.length();
        for (int i = 0; i < x; i++) {
            result.insert(0, "0");
        }
        return result.toString();
    }
}
