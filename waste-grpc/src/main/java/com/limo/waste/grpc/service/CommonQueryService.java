package com.limo.waste.grpc.service;

import com.limo.waste.grpc.entity.CommonQueryParam;
import com.limo.waste.grpc.entity.CommonQueryResult;

/**
 * @Author limo
 * @Date 2023/7/6 11:56
 * @Description
 */
public interface CommonQueryService {

    CommonQueryResult queryAll(CommonQueryParam param);

}
