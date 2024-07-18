package com.limo.waste.feign.service;

import com.limo.waste.common.util.Result;
import com.limo.waste.feign.modal.Address;
import com.limo.waste.feign.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author limo
 * @Date 2024/7/5 15:15
 * @Description:
 */
@RestController
public class AddressServiceController {

    @Resource
    AddressService addressService;

    @GetMapping("/addressById/{id}")
    Result<Address> getAddressById(@PathVariable("id") int id){
        return Result.success(addressService.getAddressById(id));
    }

}
