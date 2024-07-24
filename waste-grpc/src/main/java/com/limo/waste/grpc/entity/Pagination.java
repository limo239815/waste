package com.limo.waste.grpc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author limo
 * @Date 2024/6/27 15:49
 * @Description:
 */
@Accessors(chain = true)
@Data
public class Pagination {
    private int page;
    private int current;
    private int pageSize;
    private int total;
}
