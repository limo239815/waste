package com.limo.waste.grpc.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Author limo
 * @Date 2024/6/27 15:46
 * @Description:
 */
@Data
public class CommonQueryResult {
    private String responseMessage;
    private String errorMessage;
    private String success;
    private int total;
    private Map<String,String> mapSum;
    private List<Map<String,Object>> rows;
}
