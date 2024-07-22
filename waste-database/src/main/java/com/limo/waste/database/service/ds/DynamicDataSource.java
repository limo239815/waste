package com.limo.waste.database.service.ds;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Description 继承Spring-jdbc数据源路由类，实现数据源路由切换
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    /**
     * 指定路由Key,这里很简单 获取 threadLocal 中目标key 即可
     *
     * @return Object
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getContextKey();
    }

}
