package com.limo.waste.database.service;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

/**
 * @Author limo
 * @Date 2024/7/18 18:27
 * @Description: 连接池管理
 */
public class DataSourceProvider {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/magic_rcs");
        config.setUsername("root");
        config.setPassword("0102");
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        dataSource = new HikariDataSource(config);
    }

    public static DataSource getDataSource(){
        return dataSource;
    }

}
