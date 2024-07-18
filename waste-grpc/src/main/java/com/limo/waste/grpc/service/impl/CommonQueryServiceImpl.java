package com.limo.waste.grpc.service.impl;

import com.alibaba.fastjson.JSON;
import com.common.query.grpc.OfbizCommonGrpc;
import com.common.query.grpc.OfbizCommonRequest;
import com.common.query.grpc.OfbizCommonResponse;
import com.google.gson.Gson;
import com.limo.waste.grpc.service.CommonQueryService;
import com.limo.waste.grpc.entity.CommonQueryParam;
import com.limo.waste.grpc.entity.CommonQueryResult;
import com.limo.waste.grpc.entity.SysPara;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author
 * @Date 2023/7/6 12:03
 * @Description 通用查询服务实现
 */
@Service
@Slf4j
public class CommonQueryServiceImpl implements CommonQueryService {

    @Resource
    private OfbizCommonGrpc.OfbizCommonBlockingStub ofbizService;

    @Override
    public CommonQueryResult queryAll(CommonQueryParam param) {
        OfbizCommonRequest request = OfbizCommonRequest.newBuilder()
                .setCommonData(new Gson().toJson(param)).build();
        try {
            OfbizCommonResponse response = ofbizService.publicExec(request);
            String resultStr = response.getReturnData();
            return JSON.parseObject(resultStr,CommonQueryResult.class);
        }catch (Exception ex){
            ex.printStackTrace();
            return new CommonQueryResult();
        }

    }
}
