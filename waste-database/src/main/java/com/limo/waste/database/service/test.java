package com.limo.waste.database.service;

import com.limo.waste.database.dal.Column;
import com.limo.waste.database.dal.DatabaseConfig;
import com.limo.waste.database.dal.Table;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author limo
 * @Date 2024/7/18 18:30
 * @Description:
 */
public class test {

    public static void main(String[] args) {
        try {
            List<Column> columns = new ArrayList<>();
            columns.add(new Column().setName("id").setType("int").setAutoIncrement(true).setNotNUll(true)
            .setPrimaryKey(true));
            columns.add(new Column().setName("name").setType("VARCHAR(50)").setAutoIncrement(false).setNotNUll(true)
                    .setPrimaryKey(false));
            columns.add(new Column().setName("ddTenantId").setType("VARCHAR(20)").setAutoIncrement(false).setNotNUll(true)
                    .setPrimaryKey(true));
            List<Column> columns2 = new ArrayList<>();
            columns2.add(new Column().setName("id").setType("int").setAutoIncrement(true).setNotNUll(true)
                    .setPrimaryKey(true));
            columns2.add(new Column().setName("name").setType("VARCHAR(50)").setAutoIncrement(false).setNotNUll(true)
                    .setPrimaryKey(false));
            columns2.add(new Column().setName("ddTenantId").setType("VARCHAR(20)").setAutoIncrement(false).setNotNUll(true)
                    .setPrimaryKey(true));
            List<Table> tables = new ArrayList<>();
            tables.add(new Table().setName("order1").setColumns(columns));
            tables.add(new Table().setName("order2").setColumns(columns2));
            DatabaseConfig config = new DatabaseConfig().setDatabase("ttest")
                    .setTables(tables);
            DatabaseInitializer.initialize(config);
            DataSource dataSource = DataSourceProvider.getDataSource();
            try (Connection conn = dataSource.getConnection();
                 Statement statement = conn.createStatement();
                 ResultSet rs = statement.executeQuery("select database();")){
                if (rs.next()){
                    System.out.println("Connected to database: "+rs.getString(1));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
