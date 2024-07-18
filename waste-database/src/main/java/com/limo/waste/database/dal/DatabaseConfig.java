package com.limo.waste.database.dal;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Author
 * @Date 2024/7/18 14:27
 * @Description:
 */
@Accessors(chain = true)
@Data
public class DatabaseConfig {

    private String database;

    private List<Table> tables;

}
