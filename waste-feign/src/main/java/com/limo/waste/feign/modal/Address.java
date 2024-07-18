package com.limo.waste.feign.modal;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author limo
 * @Date 2024/7/5 13:51
 * @Description:
 */
@Accessors(chain = true)
@Data
public class Address {

    private String province;

    private String city;

    private String zone;

    private String desc;

}
