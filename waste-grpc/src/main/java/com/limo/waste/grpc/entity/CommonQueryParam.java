package com.limo.waste.grpc.entity;

import lombok.Data;

import java.util.Map;

/**
 * @Author limo
 * @Date 2024/6/27 15:47
 * @Description:
 */
@Data
public class CommonQueryParam {

    private SysPara sysPara;

    private Map<String,Object> userPara;

    private AddPara addPara;
}
