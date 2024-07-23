package com.limo.waste.grpc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author limo
 * @Date 2024/7/23 14:28
 * @Description: 用户
 */
@Accessors(chain = true)
@Data
public class User {

    private String userId;

    private String employeeId;
    private String employeeName;

    private String ddTenantId;

    private String phone;
    private String email;

    private String accessToken;

    private String userPassword;


}
