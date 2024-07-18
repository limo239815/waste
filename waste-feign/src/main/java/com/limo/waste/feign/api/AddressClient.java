package com.limo.waste.feign.api;

import com.limo.waste.common.util.Result;
import com.limo.waste.feign.modal.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author limo
 * @Date 2024/7/5 13:51
 * @Description:
 */
@FeignClient(name = "addressClient",url = "http://localhost:8080")
public interface AddressClient {

    @GetMapping("/addressById/{id}")
    Result<Address> getAddressById(@PathVariable("id") int id);

}


