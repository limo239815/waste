package com.limo.waste.feign.service;

import com.limo.waste.feign.modal.Address;

/**
 * @Author limo
 * @Date 2024/7/5 13:50
 * @Description:
 */
public interface AddressService {

    Address getAddressById(int id);

}
