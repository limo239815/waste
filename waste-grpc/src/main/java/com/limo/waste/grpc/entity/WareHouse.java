package com.limo.waste.grpc.entity;

import lombok.Data;

/**
 * @Author limo
 * @Date 2024/7/23 14:44
 * @Description: 仓库
 */
@Data
public class WareHouse {

    private String wareHouseId;
    private String wareHouseName;

    private String ddTenantId;

}
