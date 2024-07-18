package com.limo.waste.database.service;

import com.limo.waste.database.dal.Column;
import com.limo.waste.database.dal.DatabaseConfig;
import com.limo.waste.database.dal.Table;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author limo
 * @Date 2024/7/18 14:33
 * @Description:
 */
@Slf4j
public class DatabaseInitializer {

    public static void initialize(DatabaseConfig config) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/?user=root&password=0102";
        try (Connection conn = DriverManager.getConnection(url);
             Statement statement = conn.createStatement()){
            statement.executeUpdate("create database if not exists " + config.getDatabase()+";");
            statement.executeUpdate("use "+config.getDatabase()+";");

            for (Table table: config.getTables()){
                StringBuilder createTableSQL = new StringBuilder("create table "+table.getName()+"(");
                for (Column column : table.getColumns()){
                    createTableSQL.append(column.getName()).append(" ").append(column.getType());
                    if (column.getNotNUll() != null && column.getNotNUll()){
                        createTableSQL.append(" not null");
                    }
                    if (column.getAutoIncrement()!=null && column.getAutoIncrement()){
                        createTableSQL.append(" auto_increment");
                    }
                    if (column.getDefaultValue() != null){
                        createTableSQL.append(" default").append(column.getDefaultValue());
                    }
                    createTableSQL.append(", ");
                }

                //add primary key
                String primaryKeyColumns = table.getColumns().stream()
                        .filter(column -> column.getPrimaryKey() != null && column.getPrimaryKey())
                        .map(Column::getName)
                        .reduce((col1,col2) -> col1+","+col2)
                        .orElse("");
                if (!primaryKeyColumns.isEmpty()){
                    createTableSQL.append("primary key (").append(primaryKeyColumns).append(")");
                }else {
                    createTableSQL.setLength(createTableSQL.length() -2);
                }

                createTableSQL.append(");");
                log.info("sql:{}",createTableSQL);
                statement.executeUpdate(createTableSQL.toString());
            }
        }
    }

}
