package com.limo.waste.database.service.ds;

import org.springframework.core.NamedThreadLocal;
import org.springframework.util.StringUtils;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author
 * @Date 2023/6/23 15:25
 * @Description 核心基于ThreadLocal的切换数据源工具类
 */
public class DynamicDataSourceContextHolder {

    /**
     * 动态数据源名称上下文
     */
    private static final ThreadLocal<String> DATASOURCE_CONTEXT_KEY_HOLDER = new ThreadLocal<>();
    /**
     * 设置/切换数据源
     */
    public static void setContextKey(String key){
        DATASOURCE_CONTEXT_KEY_HOLDER.remove();
        DATASOURCE_CONTEXT_KEY_HOLDER.set(key);
    }
    /**
     * 获取数据源名称
     */
    public static String getContextKey(){
        String key = DATASOURCE_CONTEXT_KEY_HOLDER.get();
        return key == null? DataSourceConstant.DS_KEY_MASTER:key;
    }
    /**
     * 删除当前数据源名称
     */
    public static void removeContextKey(){
        DATASOURCE_CONTEXT_KEY_HOLDER.remove();
    }

    /**
     * 为什么要用链表存储(准确的是栈)
     * <pre>
     * 为了支持嵌套切换，如ABC三个service都是不同的数据源
     * 其中A的某个业务要调B的方法，B的方法需要调用C的方法。一级一级调用切换，形成了链。
     * 传统的只设置当前线程的方式不能满足此业务需求，必须使用栈，后进先出。
     * </pre>
     */
    private static final ThreadLocal<Deque<String>> LOOKUP_KEY_HOLDER = new NamedThreadLocal<Deque<String>>("dynamic-datasource") {
        @Override
        protected Deque<String> initialValue() {
            return new ArrayDeque<>();
        }
    };

    private DynamicDataSourceContextHolder() {
    }

    /**
     * 获得当前线程数据源
     *
     * @return 数据源名称
     */
    public static String peek() {
        return LOOKUP_KEY_HOLDER.get().peek();
    }

    /**
     * 设置当前线程数据源
     * <p>
     * 如非必要不要手动调用，调用后确保最终清除
     * </p>
     *
     * @param ds 数据源名称
     */
    public static String push(String ds) {
        String dataSourceStr = StringUtils.hasLength(ds) ? ds : "";
        LOOKUP_KEY_HOLDER.get().push(dataSourceStr);
        return dataSourceStr;
    }

    /**
     * 清空当前线程数据源
     * <p>
     * 如果当前线程是连续切换数据源 只会移除掉当前线程的数据源名称
     * </p>
     */
    public static void poll() {
        Deque<String> deque = LOOKUP_KEY_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            LOOKUP_KEY_HOLDER.remove();
        }
    }

    /**
     * 强制清空本地线程
     * <p>
     * 防止内存泄漏，如手动调用了push可调用此方法确保清除
     * </p>
     */
    public static void clear() {
        LOOKUP_KEY_HOLDER.remove();
    }
}
