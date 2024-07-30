package com.limo.waste.database.service.ds;

import com.mysql.cj.jdbc.Driver;
import com.zaxxer.hikari.HikariDataSource;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Description 实现Spring数据源管理接口
 */
@Slf4j
@Configuration
@AllArgsConstructor
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class DynamicDataSourceConfig implements TransactionManagementConfigurer {
    private final Map<Object, Object> dataSourceMap = new HashMap<>(8);
    private final DataSourceProperties dataSourceProperties;
    private final StringEncryptor stringEncryptor;

    @Bean("dynamicDataSource")
    public DynamicDataSource dataSource() {
        DynamicDataSource ds = new DynamicDataSource();
        HikariDataSource cads = new HikariDataSource();
        cads.setJdbcUrl(dataSourceProperties.getUrl());
        cads.setDriverClassName(dataSourceProperties.getDriverClassName());
        cads.setUsername(dataSourceProperties.getUsername());
        cads.setPassword(dataSourceProperties.getPassword());
        cads.setMaximumPoolSize(5);
        cads.setMaxLifetime(60*1000);
        ds.setDefaultTargetDataSource(cads);
        dataSourceMap.put(DataSourceConstant.DS_KEY_MASTER, cads);
        ds.setTargetDataSources(dataSourceMap);
        ds.afterPropertiesSet();  // 确保数据源设置后进行初始化
        return ds;
    }

    /**
     * 组装默认配置的数据源，查询数据库配置
     */
    //@PostConstruct
    public void init() {
        DriverManagerDataSource dds = new DriverManagerDataSource();
        dds.setUrl(dataSourceProperties.getUrl());
        dds.setDriverClassName(dataSourceProperties.getDriverClassName());
        dds.setUsername(dataSourceProperties.getUsername());
        dds.setPassword(dataSourceProperties.getPassword());

        List<Map<String, Object>> dbList = new JdbcTemplate(dds).queryForList(DataSourceConstant.QUERY_DS_SQL);
        log.info("开始 -> 初始化动态数据源");
        Optional.of(dbList).ifPresent(list -> list.forEach(db -> {
            log.info("数据源:租户{}-组别{}-数据库名{}", db.get(DataSourceConstant.TENANT_ID),db.get(DataSourceConstant.ENTITY_GROUP_NAME),db.get(DataSourceConstant.DS_NAME));
            HikariDataSource ds = new HikariDataSource();
            String url = "jdbc:mysql://"+ db.get(DataSourceConstant.DATABASE_SERVER_NAME) +":"+ db.get(DataSourceConstant.PORT) +"/"+db.get(DataSourceConstant.DS_NAME)+"?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
            ds.setJdbcUrl(url);
            ds.setDriverClassName(Driver.class.getName());
            ds.setUsername((String) db.get(DataSourceConstant.DS_USER_NAME));
            ds.setMaximumPoolSize(5);
            ds.setMaxLifetime(60*1000);
            String decPwd = stringEncryptor.decrypt((String) db.get(DataSourceConstant.DS_USER_PWD));
            ds.setPassword(decPwd);
            String dsRouteKey = String.valueOf(db.get(DataSourceConstant.ENTITY_GROUP_NAME))+ db.get(DataSourceConstant.TENANT_ID);
            dataSourceMap.put(dsRouteKey, ds);
        }));

        log.info("完毕 -> 初始化动态数据源,共计 {} 条", dataSourceMap.size());
    }

    /**
     * 重新加载数据源配置
     */
    public Boolean reload() {
        init();
        DynamicDataSource dataSource = dataSource();
        dataSource.setTargetDataSources(dataSourceMap);
        dataSource.afterPropertiesSet();
        return Boolean.FALSE;
    }

    @Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Override
    public TransactionManager annotationDrivenTransactionManager() {
        return txManager();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
