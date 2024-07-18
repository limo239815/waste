package com.limo.waste.database.dal;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author
 * @Date 2024/7/18 14:30
 * @Description:
 */
@Accessors(chain = true)
@Data
public class Column {

    private String name;

    private String type;

    private Boolean primaryKey;

    private Boolean notNUll;

    private Boolean autoIncrement;

    private String defaultValue;

}
