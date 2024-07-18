package com.limo.waste.database.dal;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Author
 * @Date 2024/7/18 14:29
 * @Description:
 */
@Accessors(chain = true)
@Data
public class Table {

    private String name;

    private List<Column> columns;

}
