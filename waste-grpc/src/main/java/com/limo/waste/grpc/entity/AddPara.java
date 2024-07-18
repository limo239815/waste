package com.limo.waste.grpc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Author limo
 * @Date 2024/6/27 15:48
 * @Description:
 */
@Accessors(chain = true)
@Data
public class AddPara {

    private Pagination pagination;

    private List<String> fieldList;

    private String orderby;
}
