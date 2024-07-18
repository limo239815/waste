package com.limo.waste.feign.service;

import com.limo.waste.feign.modal.Address;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author limo
 * @Date 2024/7/5 13:58
 * @Description:
 */
@Service
public class AddressServiceImpl implements AddressService {


    @Override
    public Address getAddressById(int id) {
        return getList(id).get(id-1);
    }
    private List<Address> getList(int num){
        List<Address> result = new ArrayList<>();
        for (int i = 1; i < num*5; i++) {
            result.add(new Address().setProvince("Sichuan"+i).setCity("Chengdu"+i).setZone("z"+i).setDesc("Big Pandas home"+i));
        }
        return result;
    }
}
